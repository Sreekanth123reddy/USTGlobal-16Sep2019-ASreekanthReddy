//named function
function circumference(radius)
{
    var PI=3.14;
    console.log('circumference of a circle',2*PI*radius);
}
circumference(23.4)
//Expression Function
var circumference=function(radius)
{
    var PI=3.14;
    return 2*PI*radius;
}
var res=circumference(11.6);
console.log('Circumference of a circle ',res);
//self invocation
(function(radius)
{
    var PI=3.14;
    console.log('circumference of a circle',2*PI*radius); 
})(8.5)
//fat arrow function
var res1=(radius)=>{
    var PI=3.14;
    console.log('circumference of a circle',2*PI*radius);
}
res1(9.4);