package vut.Rectangle;

public class Rectanglecls {

    private double length;
    private double height;

    public Rectanglecls()
    {
       this(0,0);

    }

    public Rectanglecls(double length, double height)
    {
        setLength(length);
        setHeight(height);
    }




    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
    private double Perimeter()
    {
        return (this.length*this.height)*2;
    }

    private double Area()
    {
        return (this.length*this.height);
    }


    @Override
    public String toString()
    {
        return "Perimeter is: " + Perimeter() +
                "\nyour area is: " + Area();

    }
}
