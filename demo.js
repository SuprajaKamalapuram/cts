var Rectangle = /** @class */ (function () {
    function Rectangle(l, h) {
        this.height = h;
        this.length = l;
    }
    Rectangle.prototype.getArea = function () {
        var area = Number(this.length) * Number(this.height);
        return area;
    };
    Rectangle.prototype.getPerimeter = function () {
        return 2 * (Number(this.length) + Number(this.height));
    };
    return Rectangle;
}());
var obj = new Rectangle(10, 20);
var area = obj.getArea();
console.log(area);
