export class Employee{
constructor(
        public firstName:String,
        public lastName:String,
        public salary:Number,public gender:String,
        public email:String
    ){

    }

getFullName(){
    console.log(this.firstName +" "+this.lastName+" "+this.salary);
}
}
let emp=new Employee("suppu","Khatri",50000,"female","s@gmail.com");
emp.getFullName();