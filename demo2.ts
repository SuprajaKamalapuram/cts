export interface Info{
    getFullName()

    }
export class Employee implements Info{
    getFullName(){
        throw new Error("method not implemented");
        
    }

}
export class FullTimeEmployee{

}
class PartTimeEmployee{
    
}