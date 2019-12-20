//variable hoisting
console.log(hoist);
var hoist=10;
function hoisting(){
    console.log(hoist);
    var hoist=10;
}
hoisting();
