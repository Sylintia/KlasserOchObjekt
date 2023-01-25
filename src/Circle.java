import java.util.Scanner;

public class Circle {

    Scanner myScanner = new Scanner(System.in);
    double radius = 1.0;
    double area;
    double circumference;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void start() {
        Amount();
        Radius();
        toString();
    }

    public void Amount(){
        System.out.println("How many circles do you want to create?");
        String amount = myScanner.next();
    }

    public void Radius(){
        System.out.println("How big should the radius of the circles be?");
        String radius = myScanner.next();
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        this.area = (Math.PI * (radius * radius));
        return area;
    }

    public double getCircumference(){
        this.circumference = (2 * radius * Math.PI);
        return circumference;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "The radius of the circle is " + radius + ", the area of the circle is " + area + " and the circumference of the circle is " + circumference;
    }
}
