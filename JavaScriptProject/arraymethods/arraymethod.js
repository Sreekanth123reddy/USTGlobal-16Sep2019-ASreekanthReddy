const hobbies=['watching movies','sleeping','coding','eating','flarting'];
console.log(typeof hobbies);
//hobbies is array  or not
console.log(Array.isArray(hobbies));
//returns t/f ,if sleeping is includes in array called hobbies
console.log(hobbies.includes('sleeping'));
//returns t/f ,it starts checking from the index which we were specified
console.log(hobbies.includes('cricket',4));
//It will return the new length of an array ,by adding the data at last position,
//any number of elements we can add
console.log(hobbies.push('cricket','volleyball'));
//It will return the last element from an array and print
console.log(hobbies.pop());
//add the element at first index and returns new length
console.log(hobbies.unshift('singing','dancing'));
//remove the element from first index
console.log(hobbies.shift());
//splice method has 1st parameter as starting index ,2nd parameter is how many elements 
//you need to delete ,3rd parameter is to add new elements
console.log(hobbies.splice(2,2,'Watching Environment','PUBG'));
//slice method will return new array , it will not modify original array ,it will take 2 parameters
console.log('===================================');
const movies=['Gang Leader','Everu','Oh Baby','Guna 369','Saaho','valmiki'];
movies.splice(1,2,'EndGame','Jersey');
console.log('After splice mrthod',movies);
const afterSlice=movies.slice(2,4)
console.log('After slice method',afterSlice);
console.log('movies array',movies);
//If element is not present returns -1
console.log(movies.indexOf('Syeraa'));
console.log(movies.indexOf('Saaho',2));
//Array is converted to String and returns in string format e.g :Gang Leader-Everu-EndGame-Jersey-Saaho-Valmiki
console.log(movies.join('-'));
//By Default it returns , 
console.log(movies.join())
const numbers=[100,200,300,400,500];
//map function will return the new array 
const numbers1=numbers.map(function(value,index){
    let newValue=value+50;
    return newValue;
})
console.log(numbers1);
//fatarrow for an array
const number2=numbers.map(value=> value+50);
console.log(number2);
//filter function will return t/f ,if it is true then create new array
const a=numbers.filter(function(value,index){
    if(value>200)
        return true;
        else
        return false;
})
console.log('array',a);
//using fat arrow for a filter function
const b=numbers.filter(value=>value>200);
console.log('array',b);
//using map add all price +300
 const items =[{
     name:'Ear rings',
     id:1,
     price:5000,
 },
 {
     name :'kajal',
     id:2,
     price:1000,
 },
 {
     name:'Trimmer',
     id:3,
     price:3000
 },
 {
     name:'Beardo',
     id:4,
     price:170
 }]
const item1= items.map(function(item,index){
      item.price = item.price+300;
      return item;
 })
 console.log(item1);
 const item2 = items.map((value)=>{
     value.price = value.price+300;
     return value
 });
console.log(item2);

console.log("===================================")
//fatarrow for objects
const updatedItem = items.filter((item)=>item.price+300)
console.log(updatedItem);
// let str='Hello World';
// console.log(str.split('o'));
// console.log(str.split('W',3));
