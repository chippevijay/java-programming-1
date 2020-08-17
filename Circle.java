import java.awt.desktop.SystemEventListener;
import java.util.*;
public class Circle {
      private double radius ;
      private String color ;
      double area;
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    Circle(double rad){
        this.radius=rad;
        color ="red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
class circleMain{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radii;
        System.out.println("Enter the radius :");
        radii = scan.nextDouble();
        Circle c1 = new Circle();
        Circle c2 = new Circle(radii);
        System.out.println("Area of Circle with default radius is :"+c1.getArea());
        System.out.println("Area of Circle with user given radius is :"+c2.getArea());
    }
}
