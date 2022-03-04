package vut.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {

        RectangleClass box;

        box = new RectangleClass();

        System.out.println("***************");
        System.out.println(box);

        box.setHeight(25);
        box.setLength(30);
        box.setxCoord(44);
        box.setyCoord(88);

        System.out.println(box.toString());
        System.out.println("****************");
        box.moveRectangle(66, 88);
        System.out.println(box.toString());
    }
}
