"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(firstName, lastName, salary, gender, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
        this.email = email;
    }
    Employee.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName + " " + this.salary);
    };
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee("suppu", "Khatri", 50000, "female", "s@gmail.com");
emp.getFullName();
