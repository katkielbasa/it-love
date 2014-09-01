var a = (function test() {
    console.log('test');
    return 1;
})();

console.log(a)

function test1() {
    console.log('gunwo');
}
(function hello(name) {
    console.log('hello ' + name);
})('jan');

test1();
test1();
test1();
test1();