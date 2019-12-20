let h1element = document.getElementById('demo');
console.log('Element =>',h1element);
//to get content of tag
console.log('Element text :',h1element.textContent)
//to change the content of the tag
console.log("changed text  ->",h1element.textContent = 'Good Evening');
//To create a element dynamically
let but = document.createElement('button');
console.log('button element ->',but);
//to add the text content to the newly created element
but.textContent='click me!!'
//console.log('After adding content to tag',but)
console.log('========================')
//to add the newly created element to DOM
// document.body.appendChild(but);
// // creting tag dynamically with DOM
// let ulelement = document.createElement('ul');
// let li1element = document.createElement('li');
// let li2element = document.createElement('li');
// let li3element = document.createElement('li');
// //adding content
// li1element.textContent='Java'
// li2element.textContent='Sql'
// li3element.textContent='Java Script'
// //adding tags to document
// ulelement.appendChild(li1element);
// ulelement.appendChild(li2element);
// ulelement.appendChild(li3element);
// document.body.appendChild(ulelement);
// //adding style through js in dom
// h1element.style.color = 'red' ;
// h1element.style.fontSize = '20px'
//Event function
function showMessage(){
    alert('hi hello welcome!!!!');
}
function changeColor(){
    // let p1Element = document.getElementById("ptag")
    // p1Element.style.color='red';
    document.getElementById("ptag").style.color='green';
}
function removeColor(){
    document.getElementById("ptag").style.color='black';
}
function printHello(){
    console.log('Hello');
   let userName = document.getElementById('username').value;
   document.getElementById("showusername").textContent = userName ;
}
let name = 'sreekanth reddy'
let age  = 21;
let phoneno = 8374036361;
console.log('Name is  '+  name + '   Age is   '+ age+'  phone no is   '+ phoneno);
console.log(`name is    ${name} Age is      ${age}  phonenumber is ${phoneno}`);