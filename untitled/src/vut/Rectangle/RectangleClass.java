package vut.Rectangle;
/**
 * class file for drawing the rectangle on a canvas
 *
 * @author 215079698
 */
public class RectangleClass {

    //local attributes
    double length,height,xCoord, yCoord;
    /**
     * constructor for Rectangle class
     */
    public RectangleClass()
    {
        this(0.0,0.0,0.0,0.0);
    }
    /**
     * overloaded constructor
     * @param length length of rectangle
     * @param height height of rectangle
     * @param xCoord x Coordinate
     * @param yCoord y Coordinate
     */
    public RectangleClass(double length,double height, double xCoord,double yCoord)
    {
        setHeight(height);
        setLength(length);
        setxCoord(xCoord);
        setyCoord(yCoord);
    }
    /**
     * initializing length
     *
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }
    /**
     * initializing height
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * initializing x Coordinate
     *
     * @param xCoord x Coordinate
     */
    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }
    /**
     * initializing y Coordinate
     *
     * @param yCoord y Coordinate
     */
    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }
    /**
     *method that moves location of rectangle
     * @param xCoord
     * @param yCoord
     */
    public  void moveRectangle(double xCoord,double yCoord)
    {
        setxCoord(xCoord);
        setyCoord(yCoord);
    }
    /**
     * calculating the perimeter of the rectangle
     * @return
     */
    public double perimeter()
    {
        return (this.length + this.height)*2;
    }
    /**
     * method for calculating the area of a rectangle
     * @return
     */
    public double area()
    {
        return (this.length * this.height);
    }
    /**
     * to string method to display the values of the rectangles attributes
     * @return
     */
@Override
//toString method has to start with small letter "t"
    public String toString()
{
    return "The perimeter is " + perimeter() +
            "\nthe area is " + area() +
            "\nThe x coordinate is " + this.xCoord +
            "\n The y coordinate is " + this.yCoord;

}

}
