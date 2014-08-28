var Figura = function(nazwa) {
    this.nazwa = nazwa;
};
Figura.prototype.print = function() {
    var message = 'To jest: ';
    console.log(message + this.nazwa);
};

var figura = new Figura('figura');
var cokolwiek = new Figura('figura');
var cokolwiek2 = new Figura('figura2');
cokolwiek.print();
cokolwiek2.print();

function Kwadrat(config) {
    this.color = config.color;
    //this.nazwa = nazwa;
    Figura.call(this, config.nazwa);
}

Kwadrat.prototype = figura;
Kwadrat.prototype.print = function() {
    Figura.prototype.print.call(this);
    console.log('Kolor: ' + this.color);
};

var kwadrat = new Kwadrat({
    nazwa: 'kwadrat',
    color: 'red'
});
kwadrat.print();
