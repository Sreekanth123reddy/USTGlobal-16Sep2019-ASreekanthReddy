function myFunction(){
  let us =  document.getElementById('un').value;
  us = us.trim();
  let usl = us.length;
  uslCheck(usl);
}
function uslCheck(n){
    if(n<=5)
    {
        pa.textContent = "*username is invalid";
        document.getElementById('un').color = 'red';
    }
    else{
        pa.textContent = '';
        document.getElementById('un').style.border = '1 px solid red';
        document.getElementById('un').style.outline = 'none';
    }
}
function myFunction1(){
    let pw = document.getElementById('psw').value;
    pw = pw.trim();
    let pwl = pw.length;
    pwlCheck(pwl);
}
function pwlCheck(n){
    if(n<=5)
    {
        ra.textContent = "*password is invalid";
        document.getElementById('psw').color = 'red';
    }
    else{
        ra.textContent = '';
        document.getElementById('psw').style.border = '1 px solid red';
        document.getElementById('psw').style.outline = 'none';
    }
}