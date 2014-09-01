var i = 0;
var j = 1;
var suma = 1;
var max = 100;

while (suma < max) {
    console.log(suma);
    suma = i + j;
    i = j;
    j = suma;
}