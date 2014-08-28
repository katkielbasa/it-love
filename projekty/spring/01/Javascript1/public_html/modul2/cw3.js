/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validate(currencyValue) {
    return /^\d+([.,]\d{2})?\s(PLZ|PLN|EUR|EU)$/.test(currencyValue);
    //^zaczyna sie od
    //\s dowolna ilosc spacji
    //$ dana czesc musi wystapic
}
function calculate(eur,exchangeRate) {
    var value = parseFloat(eur.replace(',', '.')),
            result = value * exchangeRate;
    return (result.toFixed(2) + 'PLN').replace('.', ',');
}

console.log(calculate('200.11 EUR',100));
console.log(validate('300 PLN'));
console.log(validate('300.66 EUR'));
console.log(validate('300,77 EU'));
console.log(validate('300,333 PLN'));
console.log(validate('300 PLZ'));


















































