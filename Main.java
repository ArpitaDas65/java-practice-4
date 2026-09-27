abstract class Shape{
    //abstruct method for calculating area
    abstract double calculateArea();
    //concrete method for displaying the area
    void displayArea(){
        System.out.println("area:"+calculateArea());
    }
}
//concrete subclass:Circle
class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override 
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}
//concrete subclass:rectangle
class Rectangle extends Shape{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override 
    double calculateArea(){
        return length*width;
    }
}
//main class 
public class Main{
    public static void main(String[] args) {
        Shape circle =new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        circle.displayArea();
        rectangle.displayArea();

    }
}
