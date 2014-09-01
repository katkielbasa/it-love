function first() {
    var a = 1;
    return function() {
        console.log(a++);
    };
}

var a = first;

a(1)();
a()();
a()();

var b = first();

b();
b();
b();
