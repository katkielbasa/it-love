function validate(currencyValue) {
    return /^\d+([,.]\d{2})? (PLN|PLZ|EUR|EU)$/.test(currencyValue);
}//jako spacja może być albo spacja albo \s

function calculate(eur, exchangeRate) {
    var value = parseFloat(eur.replace(',', '.')),
        result = value * exchangeRate;
    return (result.toFixed(2) + ' PLN').replace('.', ',')
}

console.log(validate('300 PLN'));
console.log(validate('300,66 PLN'));
console.log(validate('300 PLZ'));
console.log(validate('300.77 EU'));
console.log(validate('300,66 PLz'));
console.log(validate('300,34 EUR'));
console.log(validate('300,343 PLN'));
console.log(calculate('300,04 EUR', 4.14));