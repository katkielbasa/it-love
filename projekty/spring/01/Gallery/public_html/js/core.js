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
        forEach : each,
        on : on,
        get : function (id) {
            return document.getElementById(id);
        },
        ready : function(callback) {
            on(window, 'load', callback);
        },
        fadeIn : fadeIn
    };
})();

var $ = $ || CORE;
//jesli $ nie byl tu zdefiniowany inaczej, podstaw pod $ CORE