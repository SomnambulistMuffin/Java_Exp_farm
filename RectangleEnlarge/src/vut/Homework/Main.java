package vut.Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double length,height,xCoord,yCoord;

        RectangleClass box;

        Scanner input = new Scanner(System.in);

       length = getLength(input);
       height = getHeight(input);
        xCoord = getxCoord(input);
        yCoord = getyCoord(input);


        box = createRectangle(length,height,xCoord,yCoord);

        display(box);


    }
    public static double getLength(Scanner input)
    {
        System.out.println("Please enter the length: ");
        return input.nextDouble();
    }
    public static double getHeight(Scanner input)
    {
        System.out.println("Please enter the Height: ");
        return input.nextDouble();
    }
    public static double getxCoord(Scanner input)
    {
        System.out.println("Please enter the x Coordinate: ");
        return input.nextDouble();
    }
    public static double getyCoord(Scanner input)
    {
        System.out.println("Please enter the y Coordinate: ");
        return input.nextDouble();
    }
    public static  void display(RectangleClass box)
    {
        System.out.println(box.toString());
    }

    public static RectangleClass createRectangle(double length,double height,double xCoord,double yCoord)
    {
        RectangleClass box;
        return new RectangleClass(length,height,xCoord,yCoord);
    }

}
