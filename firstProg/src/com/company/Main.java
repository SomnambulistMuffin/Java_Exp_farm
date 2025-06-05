package com.company;

import java.util.Scanner;

public class Main {
    /**class work for area and perimeter calculations of a circle
     *
     *
     * @param input
     * @return
     */
    public static void main(String[] args)
        {
            DisplayWelcome();

            //assigning variables
            double radius, area;

            //scanner initialisation
           Scanner input = new Scanner(System.in);

            //retrieving radius
             radius =
             //calculating the area
            area = calcArea(radius);

            //display results
            displayResults(area,radius);
        } getRadius(input);


    /**
     * displaying Welcome banner message method
     */
    private static void DisplayWelcome()
            /*displays a banner message*/
    {
        System.out.println( "-----------------------------------------"+
                            "\n--------                  ---------------"+
                            "\n------                      -------------"+
                            "\n----                           ----------"+
                            "\n---   Area Calculator of        ---------"+
                            "\n--          a circle             --------"+
                            "\n--                               --------"+
                            "\n---                              --------"+
                            "\n----                            ---------"+
                            "\n------                        -----------"+
                            "\n--------                   --------------"+
                            "\n-----------            ------------------"+
                            "\n-----------------------------------------");
    }

    /**
     * Behaviour for getting the radius value from user
     * @param input
     * @return input
     */
    private static double getRadius(Scanner input)
       /*gets the radius from user input*/
    {
        System.out.println("Please enter Radius: ");
        return input.nextDouble();
    }

    /**
     * calculating the area after receiving radius (r)
     * @param r
     * @return
     */
    private static double calcArea(double r)
        /*calculates the area of the circle from given radius*/
    {
        double pi = 3.14;
        System.out.println("your Area is " );
        return pi*r*r;
    }

    /**
     * displayig the radius and area values back to the user
     * @param area ( area of circle)
     * @param radius ( radius of circle)
     */
    private static void displayResults(double area, double radius)
        /*displays the results of all calculations*/
    {
        System.out.println("The radius of the circle is: "+ radius + " units"+ "\n the Area of the circle is: " +area+ " units^2");
        System.out.println("The radius of the circle is: "+ radius + " units"+ "\n the Area of the circle is: " +area+ " units^2");
    }
}
