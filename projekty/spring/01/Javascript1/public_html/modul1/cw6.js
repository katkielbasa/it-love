var sum=add(3,4);


//function add(a,b){
//    return a+b;
//}
console.log(sum);
//to tez jest ok tu: suma to 7
//function add(a,b,c,d){
//    return a+b;
//}
function add(){
    return arguments[0]+arguments[1];
}