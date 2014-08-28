/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//funkcja samowywołujaca sie - pozwala stworzyc wlasny wyizolowany model

(function test(){
    console.log('test');
}());
//})();
(function test(name){
    console.log('hello ' + name);
})('jan');

var a =(function test(name){
    console.log('hello ' + name);
return 1;
})('jan');

 console.log(a);

