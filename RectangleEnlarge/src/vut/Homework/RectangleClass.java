package vut.Homework;

public class RectangleClass {

    //local variables
    double length,height,xCoord,yCoord;

    public RectangleClass()
    {
        this(0.0,0.0,0.0,0.0);

    }

    public RectangleClass(double length,double height,double xCoord,double yCoord)
    {
        setLength(length);
        setHeight(height);
        setxCoord(xCoord);
        setyCoord(yCoord);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double perimeter( )
    {
        return (this.length+this.height)*2;
    }

    public double area()
    {
        return (this.height*this.length);
    }

    public void enlargeRectangle(double xCoord,double yCoord)
    {
        setxCoord(xCoord);
        setyCoord(yCoord);
    }

    @Override

    public String toString()
    {
         return "the perimiter is: " + perimeter() +
                            "\n the Area is: " + area() +
                            "\n the x Coordinate is: " + this.xCoord +
                            "\n the y Coordinate is: " + this.yCoord;
    }
}
