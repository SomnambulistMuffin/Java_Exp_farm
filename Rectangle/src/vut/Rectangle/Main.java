package vut.Rectangle;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //behaviour
        double length, height;
        Rectanglecls rec;
        //scanner
        Scanner input = new Scanner(System.in);


        length = getlength(input);
        height = getheight(input);






      rec =  createRectangle(length,height);
        display(rec);


    }
    private static double getlength(Scanner input)
    {
        System.out.println("please enter length");
        return input.nextDouble();
    }
    private static double getheight(Scanner input)
    {
        System.out.println("please enter height");
        return input.nextDouble();
    }
    private static void display(Rectanglecls rec)
    {
        System.out.println(rec.toString());

    }

/*private static clsRectangle createRectangle(rec){
return clsRetangle rec;}
*/

    private static Rectanglecls createRectangle(double length, double height ) {
       Rectanglecls rec;

        return new Rectanglecls(length,height);

    }
}
