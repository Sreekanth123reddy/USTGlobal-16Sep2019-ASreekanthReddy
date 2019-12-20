//Named Functions
function add(a,b)
{
    console.log('add ->',a+b);
}
add(23,45);
//what if we overload method ,no method overloading
function add(a,b,c)
{
    console.log('add ->',a+b+c);
}



//Function Expreesions (Anonymous)
var sub=function(num1,num2)
{
    var subvalue=num1-num2;
    return subvalue;
}
var value=sub(90,67);
console.log('sub ->',value);



//selfInvoke functions
(function(a,b){
    console.log('mul ->',a*b);
}) (10,20)



//Fat Arrow functions
var div=(num1,num2)=>{
    console.log('value ->',num1/num2);
}
div(20,5);


var print=data=>
{
    console.log("Value ->",data);
} 
print(10)


var addition=(num1,num2)=>num1+num2;
var value=addition(10,20)
console.log("Result->",value)

//NamedFunctions can call before implementation or defining
multiplication(10,20);
function multiplication(a,b)
{
    console.log("answer->",a*b);
}
//function expression can not call before defining
printing('Welcome');
var printing = function(guldu)
{
  console.log('hi',printing); //error
}
//fat arrow wxpressions can also not call before defining
greeting('dinga')
var greeting=(msg)=>{
    console.log('hi',msg);            //error
}