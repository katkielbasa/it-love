var CORE = (function() {
    var on,
        off;
    
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
            if (Object.prototype.hasOwnProperty.call(source, key)) {
                target[key] = source[key];
            }
        }
    }   
    
    function ajax(config) {
        var defaultConfig = {
                method: 'GET',
                url: '',
                success: function() {},
                failure: function() {
                    console.log('ERROR:' + xhr.statusText);
                },
                data: '',
                headers : {}
            },
            xhr = new XMLHttpRequest();
        mix(config, defaultConfig);
        for (key in defaultConfig.headers) {
            if (hasOwnProperty.call(defaultConfig.headers, key)) {
                xhr.setRequestHeader(key, headers[key]);
            }
        }
        xhr.open(defaultConfig.method, defaultConfig.url);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4) {
                if (xhr.status >= 200 && xhr.status <= 299) {
                    defaultConfig.success(xhr.responseText, xhr);
                } else {
                    defaultConfig.failure(xhr);
                }
            }
        };
        xhr.send(defaultConfig.data);
    }
    
    if (window.addEventListener) {
        on = function(target, event, callback) {
            target.addEventListener(event, callback, true);
        };
        off = function(target, event, callback) {
            target.removeEventListener(event, callback, true);
        };
    } else {
        on = function(target, event, callback) {
            target.attachEvent('on' + event, callback);
        };
        off = function(target, event, callback) {
            target.detachEvent('on' + event, callback);
        };
    }

    return {
        forEach : each,
        on : on,
        off : off,
        get : function (id) {
            return document.getElementById(id);
        },
        ready : function(callback) {
            on(window, 'load', callback);
        },
        fadeIn : fadeIn,
        ajax: ajax
    };
})();

var $ = $ || CORE;