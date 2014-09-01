var div = document.getElementById('myDiv');
//div.style.background = 'red';
div.setAttribute('class', 'extraLarge');

var img=document.createElement('img');
img.setAttribute('src', 'bg.jpg');
img.setAttribute('alt', 'papryczki');
//document.getElementsByTagName('div')[2].appendChild(img);
//var allDivs = document.getElementsByTagName('div');

//allDivs[2].appendChild(img);

document.querySelector('div > div').appendChild(img);