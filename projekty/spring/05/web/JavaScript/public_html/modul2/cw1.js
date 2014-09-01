function findMinValue(arr) {
//    var min = arr[0],
//        idx = 0; //nic się nie stanie jak nie będzie zera
//    for (idx = 1; idx < arr.length; idx++) {
//        if (min > arr[idx])
//            min = arr[idx];
//    }
//    return min;
    return Math.min.apply(null, arr);
}

function findMinIndex(arr) {
    var min = 0,
        idx = 0; //nic się nie stanie jak nie będzie zera
    for (idx = 1; idx < arr.length; idx++) {
        if (arr[idx] < arr[min])
            min = idx;
    }
    return min;
}


var testArray = [2, 3, 4, 5, 6, 7, 8, 9, 1];
console.log("Wartosc " + findMinValue(testArray));
console.log("Index " + findMinIndex(testArray));