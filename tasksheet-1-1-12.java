import java.util.*;

class Task12 {
    public static void main(String[]args){
        Circle circle = new Circle(4);
        System.out.println("The area of the circle is "+circle.calculateArea()+".");
        System.out.println("The perimeter of the circle is "+circle.calculatePerimeter()+".");
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("The area of the rectangle is "+rectangle.calculateArea()+".");
        System.out.println("The perimeter of the rectangle is "+rectangle.calculatePerimeter()+".");
    }
}

interface Shape{
    double calculateArea();
    double calculatePerimeter();
}


abstract class AbstractShape implements Shape{
    String color;
    double length;
    double width;
    AbstractShape(){

    }
    }


class Circle extends AbstractShape{
    double radius;
   Circle(double radius){
    this.radius = radius;
}
@Override
    public double calculateArea(){
        return (Math.PI * radius * radius );
}
@Override
    public double calculatePerimeter(){
        return (2 * Math.PI * radius);
}
}

class Rectangle extends AbstractShape{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width =  width;
}

@Override
public double calculateArea(){
    return (length*width);
}
@Override
public double calculatePerimeter(){
    return ((2*length)+(2*width));
}
}