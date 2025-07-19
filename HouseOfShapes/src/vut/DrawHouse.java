package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author st
 */
public class DrawHouse extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    @Override
    public void paint(Graphics pen) {
        //Assign a graphic to graphics2D
        Graphics2D pen2D = (Graphics2D) pen;
        int x = 100;
        int y = 100;
        int width = 400;
        int height = 500;
         //final double FIFTH_HEIGHT = x/5;
         
        // rectangles
        Rectangle house = new Rectangle(x, y, width, height);
        pen2D.draw(house);
        Rectangle garage = new Rectangle(x + width, y, width, height - (y / 2));
        pen2D.draw(garage);
        Rectangle car = new Rectangle(x + width + (x / 2), y * 3, width - x, y / 4);
        pen2D.draw(car);
        Rectangle door = new Rectangle(x * 2 + (x / 2), (y * 2) + (y / 2), width / 4, height / 2);
        pen2D.draw(door);

        //circles
        Ellipse2D.Double myWheel1, myWheel2;
        myWheel1 = new Ellipse2D.Double((((x * 2)) + width) - (x / 4), (y * 3) + (y / 8), x / 4, y / 4);
        pen2D.draw(myWheel1);
        myWheel2 = new Ellipse2D.Double(width + (x * 4), (y * 3) + (y / 8), x / 4, y / 4);
        pen2D.draw(myWheel2);

        //Lines
        Line2D.Double carLeftLine = new Line2D.Double(width + (x * 2), y * 3, width + (x * 2) + (x / 4), (y * 3) - y / 4);
        pen2D.draw(carLeftLine);
        Line2D.Double carRightLine = new Line2D.Double(width + (x * 4) - (x / 5), (y * 3) - (y / 4), width + (x * 4), y * 3);
        pen2D.draw(carRightLine);
        Line2D.Double carLineStr8 = new Line2D.Double(width + (x * 2) + (x / 4), (y * 3) - y / 4, width + (x * 4) - (x / 5), (y * 3) - (y / 4));
        pen2D.draw(carLineStr8);
        Line2D.Double houseRightLine = new Line2D.Double((width + x) - (x / 2),y/2,x+width,y);
        pen2D.draw(houseRightLine);
        Line2D.Double HouseLeftLine = new Line2D.Double(x, y, x + (x / 2), y / 2);
        pen2D.draw(HouseLeftLine);
        Line2D.Double houseLineStr8 = new Line2D.Double(x + (x / 2),y/2,(width+ x)-(x/2),y/2);
        pen2D.draw(houseLineStr8);
        
    }
}
