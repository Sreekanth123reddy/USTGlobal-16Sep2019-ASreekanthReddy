//call back function
//callback can be named it  to any way just for understanding we written callback
function first(callback){
    setTimeout( function(){
        console.log('First function executed');
        callback(); 
    },0)
    //console.log('executed');
}

function second(){
    console.log('second function executed');
}
first(second);
// second();
