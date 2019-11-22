var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "Sreekanth Reddy";
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = 837036361;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = " Sree ";
address = 4556;
console.log(address, typeof address);
var a = function () {
    console.log("my age is 21");
};
a();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person('sreekanth', 21);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollnumber) {
        var _this = _super.call(this, name, age) || this;
        _this.rollnumber = rollnumber;
        return _this;
    }
    return Student;
}(Person));
var stu = new Student('sree', 21, 9915004098);
console.log(stu);
