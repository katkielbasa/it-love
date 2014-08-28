


function findIndexOfMinValue(arr) {
    var min = 0,
            idx = 0;
    for (idx = 1; idx < arr.lenght; idx++) {
        if (arr[idx] < arr[min]) {
            min = idx;
        }
    }
    return min;
}
var testArray = [2, 5, 6, 3, 7, 8];
console.log("Indeks: " + findIndexOfMinValue(testArray));


function findMinValue(arr) {
//    var min = arr[0],
//            idx = 0;
//    for (idx = 1; idx < arr.lenght; idx++) {
//        if (arr[idx] <min) {
//            min = arr[idx];
//        }
//    }
//    return min;
    return Math.min.apply(null, arr);
}
//var testArray = [2, 5, 6, 3, 7, 8];
console.log("Minimalna wartość w tablicy: " + findMinValue(testArray));