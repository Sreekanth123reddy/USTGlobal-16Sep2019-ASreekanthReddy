var todayDate = new Date();
console.log('Todays Date ->',todayDate);
console.log('Day->',todayDate.getDay());
console.log('year->',todayDate.getFullYear());
console.log('month->',todayDate.getMonth());
console.log('Date ->',todayDate.getDate());
console.log('minutes->',todayDate.getMinutes())
console.log('hours',todayDate.getHours());
console.log('-----------------------------');
var constMilli = new Date(0);
console.log('Date ',constMilli);
var constString = new Date('Nov 10');
console.log('Date String Constructor ',constString);
var constYear = new Date(1997,9,12);
console.log('Date Year Constructor ',constYear);
var constString1 = new Date('oct 10 1997');
console.log('Date String Constructor ',constString1);


