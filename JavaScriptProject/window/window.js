console.log('Window Object',window);
//this keyword refers to current window object
console.log('this keyword',this);
//window object are same as this
console.log(this === window);
//alert is used to pop up the message in a window ,this is a window object
// window.alert('welcome to Sye raa movie ,kummuko');
// alert('Sye sye raa');
//window.confirm("Are you sure to exit");

// let confirmDelete= confirm('Are you sure you want to delete');
// // console.log('confirm delete',confirmDelete);
// let un = prompt('what is your name','eg:reddy')
// console.log('username',un);
const person = {
    firstName : 'Alia',
    age :26,
    lastName :'kapoor',
    getName : function(){
        console.log('this keyword',this); //whenever  this keyword invoke with object reference will return entire object ,otherwise window object
        return this.firstName+' '+this.lastName ;
    }
}
let fullName = person.getName()
console.log('Full Name',fullName);