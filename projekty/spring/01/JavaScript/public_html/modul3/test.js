function first() {
    var a = 1;
    console.log('Jestem fn zew.');
    return function() {
        console.log(a++);
    };
}

var ab = first();
ab();
ab();
ab();

var abc = ab;
abc();
abc();
abc();


