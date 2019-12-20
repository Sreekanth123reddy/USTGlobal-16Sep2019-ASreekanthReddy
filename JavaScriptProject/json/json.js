const person = {
                    name : 'Chiranjeevi',
                    age   :  64,
                    color :'white',
                    address : {
                                city : 'Hyderabad',
                                state : 'AP',
                                pincode : 570023
                    },
                hobbies : ['coding','Bird Watching', 'singing']
            }
            console.log('JavaScript person object', person);
            const jsonObject = JSON.stringify(person);
            console.log("JSON person Object",jsonObject);
            const javascriptPersonObject = JSON.parse(jsonObject);
            console.log('Java Script person object after parse',javascriptPersonObject);
localStorage.setItem('email','sreekanthcsc1997@gmail.com');
console.log('Email Id',localStorage.getItem('email'));
localStorage.clear();

