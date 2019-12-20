//named function
function sumOfArray()
{
    var num=[10,20,30,40];
    var sum=0;
    var i;
    for(i=0;i<num.length;i++)
    {
        sum=sum+num[i];
    }
    console.log("sum of array ",sum);
}
sumOfArray();
//Expression function
var sumOfArray=function()
{
    var num=[10,20,30,40];
    var sum=0;
    var i;
    for(i=0;i<num.length;i++)
    {
        sum=sum+num[i];
    }
    return sum;
}
var res=sumOfArray();
console.log("sum of array",res);
//self invocation function
(function()
{
    var num=[10,20,30,40];
    var sum=0;
    var i;
    for(i=0;i<num.length;i++)
    {
        sum=sum+num[i];
    }
    console.log("sum of array ",sum);
})()
//fat arrow function
var sum =() =>{
    var num=[10,20,30,40];
    var sum=0;
    var i;
    for(i=0;i<num.length;i++)
    {
        sum=sum+num[i];
    }
    console.log("sum of array ",sum);
}
sum();