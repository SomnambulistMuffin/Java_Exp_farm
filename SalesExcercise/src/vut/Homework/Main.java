package vut.Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         double accAmount,currAmount;
         String name;
         Integer noSales;

        Scanner input = new Scanner(System.in);



    }
    public static double getCurrAmount(Scanner input)
    {
        System.out.println(" please enter Current Amount:");
        return  input.nextDouble();
    }
    public static double getAccAmount(Scanner input)
    {
        System.out.println(" please enter Accumulated Amount:");
        return  input.nextDouble();
    }
    public static String getName(Scanner input)
    {
        System.out.println(" please enter your name:");
        return  input.next();
    }

}
