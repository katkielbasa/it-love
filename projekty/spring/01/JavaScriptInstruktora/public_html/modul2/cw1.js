function findMinIndex(arr) {
    var min = 0,
        idx = 0;
    for (idx = 1; idx < arr.length; idx++) {
        if (arr[idx] < arr[min]) {
            min = idx;
        }
    }
    return min;
}

function findMinValue(arr) {
//    var min = arr[0],
//        idx = 0;
//    for (idx = 1; idx < arr.length; idx++) {
//        if (arr[idx] < min) {
//            min = arr[idx];
//        }
//    }
//    return min;
    return Math.min.call(null, 1, 2,4,5);
}

var testArray = [8, 2, 5, 6, 3, 7, 8];
console.log('Minimalna wartość w tablicy: ' + findMinValue(testArray));

