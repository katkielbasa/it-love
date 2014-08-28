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

function Kwadrat(nazwa, color) {
    this.color = color;
//    this.nazwa = nazwa;
//    lub
    Figura.call(this, nazwa);
//    lub
//     Figura.call(this, arguments[0]);
//    lub
//     Figura.apply(this, arguments);
//    lub
//     Figura.apply(this, [nazwa]);
}

Kwadrat.prototype = figura;
var kwadrat = new Kwadrat('kwadrat','red');

kwadrat.print();

