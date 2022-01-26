package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("linear Equation Resolver");
        System.out.println("Giver Equation as 'a*x + b = c', please enter constans");
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a: ");
         double a = input.nextDouble();
        System.out.println(" Enter b: ");
        double b = input.nextDouble();
        System.out.println(" Enter c: ");
        double c = input.nextDouble();
        if (a==0) {
            if(b==c){
                System.out.println(" the Solution is all a!");
            }else {
                System.out.println(" No Solution");
            }
        }else {
           double answer = (c - b)/a;
            System.out.printf("Equation pass with x = %f", answer);
        }
    }
}
