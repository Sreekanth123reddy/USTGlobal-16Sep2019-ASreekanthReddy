const employee = new Promise(function(resolve , reject){
    if(30 > 10){
        resolve([
            {
                name : 'Bill gates',
                age : 67
            },{
                name : 'Mark Zuckerbegh',
                age :40
            },{
                name : 'Jeff Bezos',
                age :45
            }
        ])
    }else{
        reject('Failed')
    }
})
employee.then(function(data){
    console.log('Employee data',data);
    }).catch(function(err){
        console.log('Error',err);
    })
console.log("=========================");
const message = new Promise(function(resolve,reject){
    if(10>2){
        resolve('success')
    }
    else{
        reject('error')
    }
})
message.then(function(msg){
    console.log('message',msg);
    }).catch(function(err){
        console.log('Error',err);
    })
console.log("======================")
//closures
function outerFunction(counter){
    function innerFunction(){
        let count = counter +10;
        return count;
    }
    return innerFunction;
}
let innerFunc = outerFunction(30);
let counter = innerFunc();
console.log('Counter value', counter);
//Object Destructing -> 
const person = {
    name : 'Raju',
    age : 20,
    weight : 52
}
let {name,age,weight} = person;
console.log()
//Array Destructuring
const hobbies  = ['singing','Dancing','PUBG','Reading Books'];
let[hobby,hobby1] = hobbies;
//Two objects Merging ->spread operator is used to merge two objects as a copy ,old objects are not modified
const person1 = {
    name : 'Raju',
    age : 20,
    weight : 52
}
const address = {
    city : 'bangalore'
}
const merge ={...person,...address};
console.log(merge)
//arrays merging using spread
const data = [10,20,30,40];
const data1 = ['sdh',false,true,null,undefined];
const data2 =[...data,...data1];
console.log(data2);
