//                                               Question - 1

package com.company;

import java.util.Scanner;

interface Arithmetic {
    double operation(double a , double b);
}
public class Calculator {

    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
               Arithmetic add =(double a, double b)->(a+b);
               System.out.println("Addition = "+ add.operation(num1,num2));
                break;

            case '-':
                Arithmetic sub =(double a, double b)->(a-b);
                System.out.println("Subtraction = "+ sub.operation(num1,num2));
                break;

            case '*':
                Arithmetic mult =(double a, double b)->(a*b);
                System.out.println("Multiplication = "+ mult.operation(num1,num2));
                break;

            case '/':
                Arithmetic div =(double a, double b)->{
                    if(b==0)
                        return 0;
                    return a/b;
                };
                System.out.println("Division = "+ div.operation(num1,num2));
                break;

            default:
                System.out.printf("You have entered wrong operator");

        }
    }

}
