/* Question -7 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First side :");
        double a =sc.nextDouble();
        System.out.println("Enter the Second side :");
        double b =sc.nextDouble();
        System.out.println("Enter the Third side :");
        double c =sc.nextDouble();

        double area = AreaOfTriangle(a,b,c);

        if(area ==0){
            System.out.println("Area of Triangle doest not exist!");
        }else {
            System.out.println("Area of Triangle :"+area);
        }
    }

    static  double AreaOfTriangle(double a, double b, double c){
        double area=0;
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            double s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return area;
        }
        else
            return area;
    }
}
