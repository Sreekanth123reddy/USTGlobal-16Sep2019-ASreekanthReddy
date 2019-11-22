//named function
function  checkPrime(num)
{
   var flag=false;
   if(num==0||num==1)
   {
       console.log('not a prime number');
   }
   for(var i=2;i<=num/2;i++)
   {
    if(num%i==0)
    console.log('not primenumber');
    flag=true;
    break;
    
    }
    if(flag==false)
    {
        console.log("prime number")
    } 
    
}
checkPrime(4);
//Expression functions
var checkPrime1=function(num)
{
for(var i=2;i<=num/2;i++)
{
    if(num%i==0)
    console.log('num is not prime number',num)
}
console.log('num is prime number',num)
}
checkPrime1(5);

//self invocation function
(function(num){
    for(var i=2;i<=num/2;i++)
{
    if(num%i==0)
    console.log('num is not prime number',num)
    break;
}
console.log('num is prime number',num)
  
})(5);
//fatArrow function
var prime=(num)=>
{
    for(var i=2;i<=num/2;i++)
    {
        if(num%i==0)
        console.log('num is not prime number',num)
        break;
    }
    console.log('num is prime number',num)
} 
prime(23);
