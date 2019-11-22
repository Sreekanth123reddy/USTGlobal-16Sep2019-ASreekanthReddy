let myName : string = "Sreekanth Reddy";

console.log(myName ,typeof myName);

let age : number;

console.log(age , typeof age);

let mobileNumber = 837036361;

console.log(mobileNumber , typeof mobileNumber);

let address;

address = " Sree ";

address =4556;

console.log(address , typeof address)

let a  = function() : void {
    console.log("my age is 21");
}
a();

class Person{
    constructor(public name : string , public age :number){ }
}
let person1 =  new  Person('sreekanth' , 21);
console.log(person1);

class Student extends Person{
    constructor(name :string ,age : number ,public  rollnumber : number){
        super(name,age);
    }
}
let stu = new Student('sree',21 ,9915004098);
console.log(stu);