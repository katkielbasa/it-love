var Figura = function(nazwa) { // = function Figura(nazwa)
    this.nazwa = nazwa;
};

Figura.prototype.print = function() {
    var message = 'To jest: ';
    console.log(message + this.nazwa);
};

var figura = new Figura('figura');
var cokolwiek = new Figura('pierog');
var cokolwiek2 = new Figura('pierog2');

cokolwiek.print();
cokolwiek2.print();


function Kwadrat(config) {
    this.color = config.color;
    Figura.call(this, config.nazwa);
}
//Kwadrat.prototype = figura; - jeżeli użyjemy tej konstrukcji to np. Kolo.prototype = figura - też potem będzie printowało przy pomocy funkcji Kwadrat.prototype.print - jeśli użyjemy konstrukcji z linijki 22 - Kolo nie bedzie printowac za pomoca funkcji z Kwadratu tylko domyslna funkcja Figury.
Kwadrat.prototype = new Figura; // Kwadrat.prototype = Figura.prototype niby też ale inaczej
Kwadrat.prototype.print = function() {
    Figura.prototype.print.call(this);
    console.log('Kolor: ' + this.color);
};

//function Kwadrat(color, nazwa) {
//    this.color = color;
// //   this.nazwa = nazwa; zamiast tej linii: kradziez (wypozyczenie) funkcji konstruktora
//    Figura.call(this, arguments[1]); // moze byc: Kwadrat (nazwa, color) i arguments[1] albo arguments[0] - Figura nie będzie się buntować że przekazujemy jej color
////  Figura.apply(this, arguments); // WSZYSTKIE argumenty!!!!!!!
////  Figura.apply
//}



//var kwadrat = new Kwadrat('red', 'kwadrat');

var kwadrat = new Kwadrat({
    nazwa: 'kwadrat',
    color: 'red'
});

kwadrat.print();