package com.spe_project;
import java.lang.Math;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "----------------------Simple Calculator----------------------");
        Scanner scan = new Scanner(System.in);
        int cont = 1;
        do {
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural Logarithm function");
            System.out.println("4. Power function");
            System.out.println("5. Exit");
            int choice = scan.nextInt();
            if (choice == 5) {
                cont = 0;
                System.out.println("Exiting......");
            }
            else if (choice == 1) {
                System.out.print("Enter the number : ");
                double x = scan.nextDouble();
                double result = sqrt(x);
                System.out.println("-------------------------------");
                System.out.println("The Result is : " + result);
                System.out.println("-------------------------------");

            }
            else if (choice == 2) {
                System.out.print("Enter the number : ");
                int x = scan.nextInt();
                int result = factorial(x);
                System.out.println("-------------------------------");
                System.out.println("The Result is : " + result);
                System.out.println("-------------------------------");

            }
            else if (choice == 3) {
                System.out.print("Enter the number : ");
                double x = scan.nextDouble();
                double result = loge(x);
                System.out.println("-------------------------------");
                System.out.println("The Result is : " + result);
                System.out.println("-------------------------------");

            }
            else if (choice == 4) {
                System.out.print("Enter the number : ");
                double x = scan.nextDouble();
                System.out.print("Enter the exponenet : ");
                double b = scan.nextDouble();
                double result = power(x,b);
                System.out.println("-------------------------------");
                System.out.println("The Result is : " + result);
                System.out.println("-------------------------------");

            }
            else {
                System.out.println("Not a valid choice");
            }
        } while (cont == 1);
        scan.close();
    }

    protected static double sqrt(double a) {
        double result = Math.sqrt(a);
        return result;
    }
    protected static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
    protected static double loge(double a) {
        double result = Math.log(a);
        return result;
    }
    protected static double power(double a, double b) {
        double result = Math.pow(a, b);
        return result;
    }
}
