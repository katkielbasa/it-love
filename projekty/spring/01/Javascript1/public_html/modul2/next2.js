/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var Figura = function(nazwa) {
//  pod zmienna figure podstaw funkcje
    this.nazwa = nazwa;
//jak bedzie new to w tym obiekcie otworz pole nazwa, gdzie podstawisz nazwa
};

Figura.prototype.print = function() {
    var message = 'To jest: ';
    console.log(message + this.nazwa);
//    to jest ten wspolny przodek- Object
};
var figura = new Figura('figura');
var cokolwiek = new Figura('figura');
//figura1 - referencja do nowego obiektu Figury
var cokolwiek2 = new Figura('figura2');

cokolwiek.print();
cokolwiek2.print();

function Kwadrat(config) {
    this.color = config.color;
    Figura.call(this, config.nazwa);
}
Kwadrat.prototype = figura;

Kwadrat.prototype.print = function() {

    Figura.prototype.print.call(this);
    //Wypisuje: "To jest kwadrat"
    console.log('Kolor:' + this.color);
    //Wypisuje:   'Kolor: red'
};

var kwadrat = new Kwadrat({
    nazwa: 'kwadrat',
    color: 'red'
});

kwadrat.print();

