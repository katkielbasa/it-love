

var start = 0,
        end = 100;

if (start<2){
    start=2;
}
//etykieta petli
outer: for (var idx = start; idx <= end; idx++) {
    for (var num = 2; num < idx; num++) {
        if (idx % num === 0) {
            continue outer;
        }
    }
    console.log(idx);
}