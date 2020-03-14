import {Calculator} from './calculator';

describe("testing calculator class",function(){
    it("test add function",function(){

        let cal=new Calculator();

        let ActualResult=cal.addNumbers(10,60);

        let expectedResult=70;
        expect(ActualResult).toBe(expectedResult);

    })
    
})
