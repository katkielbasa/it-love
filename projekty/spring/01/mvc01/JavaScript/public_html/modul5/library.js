var div = document.getElementById('myDiv');
div.setAttribute('class', 'extraLarge');

var img = document.createElement('img');
img.setAttribute('src', 'Desert.jpg');
img.setAttribute('alt', 'Desert');

var allDivs = document.getElementsByTagName('div');
        
//allDivs[2].appendChild(img);

document.querySelector('div > div').appendChild(img);