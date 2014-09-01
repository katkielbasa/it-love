var CORE = (function() {
    function each(tab, callback) {
        var idx = 0;
        for (idx = 0; idx < tab.length; idx++){
            callback(tab[idx], idx);
        }
    }
    return {
        forEach : each
    };
})();
//----------------------------------oddzielamy użycie biblioteki ^ od reszty vvv
var print = function(number, idx) {
console.log(idx + ":" + number);
};

CORE.forEach([1,2,3,4,5,6,7,8,9,0], print);