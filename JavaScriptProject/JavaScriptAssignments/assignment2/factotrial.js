//named function for factorial
function fact1(num)
{
    var i,fact=1;
    
    for(i=1;i<=num;i++)
    {
        fact =fact*i;
     }
     console.log("Factorial of a number is :",fact);
}
fact1(5);
//expression function for factorial
var num=function(number)
{
    var i,fact=1;
    for(i=1;i<=number;i++)
    {
        fact=fact*i;
    }
   return fact;
}
var res=num(5);
console.log("Factorial of a number is :"+res);
//selfinvoking function for factorial
(function(num){
    var i,fact=1;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    } 
    console.log("Factoril of a number is",fact);
})(5)
//fat arrow function for factorial
var fact2 = num=>
{
    var i,fact=1;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    } 
    console.log("Factoril of a number is",fact);
}  
fact2(5);
