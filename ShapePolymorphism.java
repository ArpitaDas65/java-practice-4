class Shape{
    double calculateArea(){
        return 0.0;//default implementation for generic shape
    }
}
class Circle extends Shape{
    private double radius ;
    Circle(double radius){
        this.radius=radius;
    }
    @Override 
    double calculateArea(){
        return Math.PI*radius*radius;//circle specific implementation
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override 
    double calculateArea(){
        return length*width;
    }
}
public class ShapePolymorphism {
    public static void main(String[] args) {
        //polymorphism
        Shape circle =new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        //calling overridden methods
        System.out.println("circle area:" + circle.calculateArea() );
        System.out.println("rectangle area:"+rectangle.calculateArea());
        }
}
