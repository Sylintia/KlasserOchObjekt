import java.util.Scanner;

public class Circle {

    Scanner myScanner = new Scanner(System.in);
    double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void Amount(){
        System.out.println("How many circles do you want to create?");
        String amount = myScanner.next();
    }

    public void Radius(){
        System.out.println("How big should the radius of the circles be?");
        String radius = myScanner.next();
    }

   // public int getAmount(){
  //      return this.;
  //  }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(){

    }

}
