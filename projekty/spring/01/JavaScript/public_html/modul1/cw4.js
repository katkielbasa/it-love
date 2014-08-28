 var i = 0,
     j = 1,
     sum = 1,
     start = 0,
     end = 100;

while (sum < end) {
     console.log(sum);
     sum = i + j;
     i = j;
     j = sum;
}