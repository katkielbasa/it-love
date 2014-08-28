var CORE = (function() {
    function each(tab, fn) {
        var idx = 0;
        for (idx = 0; idx < tab.length; idx++) {
            fn(tab[idx], idx);
        }
    }
    function find() {
        console.log('find');
    }
    return {
        forEach : each,
        find : find
    };
})();
//-------------------------------------------------
var print = function(number, idx) {
    console.log(idx + ':' + number);
};

CORE.forEach([1,2,3,4], print);



//var CORE = (function() {
//    var interface = new Object();
//    interface.forEach = function each(tab, fn) {
//        var idx = 0;
//        for (idx = 0; idx < tab.length; idx++) {
//            fn(tab[idx], idx);
//        }
//    };
//    
//    
//    return interface;
//})();
////-------------------------------------------------
//var print = function(number, idx) {
//    console.log(idx + ':' + number);
//};
