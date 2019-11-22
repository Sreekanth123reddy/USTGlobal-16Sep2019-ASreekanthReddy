let a = document.getElementById('un').value;
let b = document.getElementById('psw').value;
let bt;
function myFunction(){
 bt = document.getElementById('btn');
if(a.value ==='')
{
  bt.disabled = true;
}
else 
{
  bt.disabled = false;
}
}
function myFunction1(){
  bt = document.getElementById('btn');
 if(b.value ==='')
 {
   bt.disabled = true;
 }
 else 
 {
   bt.disabled = false;
 }
 }