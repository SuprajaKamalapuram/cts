class Rectangle{
    private length:Number;
    private height:Number;


constructor(l,h){
    this.height=h;
    this.length=l;
}



getArea():Number{
    let area=Number(this.length)*Number(this.height);
    return area;
}
getPerimeter():any{
    return 2*(Number(this.length)+Number(this.height));
}
}
var obj=new Rectangle(10,20);
var area=obj.getArea();
console.log(area);




