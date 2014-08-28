/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var div = document.getElementById('myDiv');
//            div.style.background = 'silver';
div.setAttribute('class', 'extraLarge');

var img = document.createElement('img');
img.setAttribute('src', 'modul2/Desert.jpg');
img.setAttribute('alt', 'Desert');
div.appendChild(img);
//na koncu w divie wstawia
var allDivs = document.getElementsByTagName('div');
//allDivs[2].appendChild(img);
document.querySelector('div > div').appendChild(img);
