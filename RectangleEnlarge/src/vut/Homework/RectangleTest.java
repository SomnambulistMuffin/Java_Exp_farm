package vut.Homework;

public class RectangleTest {


    public static void main(String[] args) {
        //creating object
        RectangleClass box;

        box = new RectangleClass();
        System.out.println(box);

        System.out.println("*******************");


        box.setHeight(10);
        box.setLength(20);
        box.setxCoord(44);
        box.setyCoord(88);

        System.out.println(box.toString());

        System.out.println("*******************");

        box.enlargeRectangle(66,88);
        System.out.println(box.toString());

    }



}
