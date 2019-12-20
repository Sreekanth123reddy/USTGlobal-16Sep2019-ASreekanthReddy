//loops in java script
var brands=['king fisher','kinley','bisleri','signature','Aqua'];
//for of loop ,it stores the element like kingfisher 
for(var element of brands){
    console.log('Brands=>',element);
}
console.log("====================================")
//for in loop ,it stores index value of an array ,used for arrays aand objects
var number=[11,43,1,23,7,9];
for(var index in number){
    console.log('array number',index,' ',number[index]);
}
//for loop 
//  for(var i=0;i<10;i++)
// {
//     console.log(i);
// } 
//for in loop can used in objects ,key value pair ,by using key we can loop ,key must be unique
//
var hero={
    name :'Megastar Chiranjeevi',
    age :64,
    moviesCount : 151,
    color :'white'
}
for(var key in hero)
{
    console.log('Info about a hero 1 :',hero[key]); 
}
//for each loop is unidirectional
var movies=[undefined,null,'Sye raa','Valmiki','Ala Vaikunta puram lo','RRR','Khaidi no 150','Indra','Racha','Magadheera'];
movies.forEach(function(value,index){
    console.log('Movie name',' ',index ,' ',value);
})
var items=[{ item:'bangles',
            id:1,
            price:100},
            {
                item:'eyeliner',
                id:2,
                price:100
            },
            {
             item:'watch',
             id:3,
             cost:3000,
            },
            {
                item:'Bike',
                id:4,
                cost:8500000
            }
        ]
        items.forEach(function(value,index)
        {
            console.log("product",index,"  --->",value);
        })

        for(var item in items)
        {
            console.log("product",item,items[item]);
        }
 //Differences of loops       
var num=[10,20,30,,40,,50];
for(var i=0;i<num.length;i++)
{
    console.log(num[i]);
}
num.forEach(function(value)
{
    console.log('element',value)
})
console.log("=======================");
num['hundred']=100;
for(var i=0;i<num.length;i++)
{
    console.log(num[i]);
}
for(var element in num)
{
    console.log("element",num[element]);
}
