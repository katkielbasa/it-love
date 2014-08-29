var CORE = (function() {
    var on;

    function each(tab, fn) {
        var idx = 0;
        for (idx = 0; idx < tab.length; idx++) {
            fn(tab[idx], idx);
        }
    }

    function fadeIn(element, duration, callback) {
        var opacity = 0,
                tick = function() {
                    opacity += 0.01;
                    element.style.opacity = opacity;
                    if (opacity < 1) {
                        setTimeout(tick, duration / 100);
                    }
                };
        element.style.opacity = opacity;
        tick();
    }

    function mix(source, target) {
        for (key in source) {
            if (hasOwnProperty.call(source, key)) {
                target[key] = source[key];
            }
        }
    }

    function ajax(config) {
//        literal obiektu; nadpisujemy klucze
        var defaultConfig = {
            method: 'GET',
            url: '',
            success: function() {
            },
            failure: function() {
                console.log('ERROR:' + xhr.statusText);
            },
            data: '',
            headers: {}
        },
        xhr = new XMLHttpRequest();
//    utworz mi nowy obiekt XMLHttpRequest
        mix(config, defaultConfig);
//        nadpisujemy klucze z config do default config

        for (key in defaultConfig.headers) {
            if (hasOwnProperty.call(defaultConfig.headers, key)) {
                xhr.setRequestHeader(key, headers[key]);
//        ta petla ustawia naglowki żądania
            }
        }
        xhr.open(defaultConfig.method, defaultConfig.url);
//        nawiązuje połączenie z serwerem, ale jeszcze nic nie wysyla
        xhr.onreadystatechange = function() {
//ma cztery stany 1-4; 4- obsluzone
            if (xhr.readyState === 4) {
                if (xhr.status >= 200 && xhr.status <= 299) {
                    //    statusy 200-299 oznaczaja ze jest ok
                    defaultConfig.success(xhr.responseText, xhr);
                } else {
                    defaultConfig.failure(xhr);
                }
            }
        };
        xhr.send(defaultConfig.data);
//        wysyla żadanie na serwer

    }

    if (window.addEventListener) {
        on = function(target, event, callback) {
            target.addEventListener(event, callback, true);
        };
    } else {
        on = function(target, event, callback) {
            target.attachEvent('on' + event, callback);
        };
    
    }

    return {
        forEach: each,
        on: on,
        get: function(id) {
            return document.getElementById(id);
        },
        ready: function(callback) {
            on(window, 'load', callback);
        },
        fadeIn: fadeIn,
        ajax: ajax
    };
})();

var $ = $ || CORE;