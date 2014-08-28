/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var CORE = (function() {
    function each(tab, jakasfunkcja) {
        var idx = 0;
        for (idx = 0; idx < tab.length; idx++) {
           jakasfunkcja(tab[idx], idx);
        }
    }
    function find(){
    console.log('find');
    }
//    pod jakasfunkcja podstaw print
    return {
        forEach: each,
        find:find
    };
})();
//CORE.forEach([1, 2, 3, 4], function(number, idx) {
//    console.log(idx + ':' + number);
//});

var print = function(number, idx) {
    console.log(idx + ':' + number);
};

CORE.forEach([1, 2, 3, 4], print);
CORE.find();
