//named function
function fib(num)
{
    var a=0,b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;
    }
}
fib(10);
//Expression Function
var fib = function(num)
{
    var a=0,b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;
    }
}
fib(10);
//self invocation function
(function(num)
{
    var a=0,b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;
    }
})(10)
//fat arrow function
var fib1 = num =>
{
    var a=0,b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;
    } 
}
fib1(10)
