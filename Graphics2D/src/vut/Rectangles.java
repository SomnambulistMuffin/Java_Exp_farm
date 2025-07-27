package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 *
 * @author st
 */
public class Rectangles extends Applet
{

    @Override
    public void init()
    {

    }

    @Override
    public void paint(Graphics pen)
    {
         Font myFont = new Font("Arial", Font.BOLD, 18);
        int x = 10;
        int y = 20;
        int h = 100;
        int w = 100;
        Graphics2D pen2D = (Graphics2D) pen;
        Rectangle myRec1, myRec2, myRec3;
        Line2D.Double myLine;

        myRec1 = new Rectangle(x, y, w, h);
        myRec2 = new Rectangle(x + (w / 2), y + (h / 2), w, h);
        myRec3 = new Rectangle(x + w, y + h, w, h);
        myLine=new Line2D.Double(x, y*13, x*22, y*13);
        
        pen2D.setColor(Color.BLUE);
        pen2D.setFont(myFont);
        
        pen2D.draw(myRec1);
        pen2D.fill(myRec2);
        pen2D.draw(myRec3);
        pen2D.draw(myLine);
        pen2D.drawString("These are my rectangles",x , y*8+h);

    }

}
