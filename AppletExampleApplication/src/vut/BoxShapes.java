
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author st
 */
public class BoxShapes extends Applet
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init()
    {
        // TODO start asynchronous download of heavy resources
    }

    /**
     *
     * @param pen
     */
    public void init(Graphics pen){
        
        Font myFont =new Font("Arial",Font.ITALIC,18);
        setFont(myFont);
        
    }
    public void paint(Graphics pen){
        //Assign a graphic to graphics2D
        Graphics2D pen2D = (Graphics2D) pen;
        
        Rectangle myRec1 = new Rectangle(10,20,100,100);
        pen2D.setColor(Color.RED);
        pen2D.draw(myRec1);
        pen2D.fill(myRec1);
        
        Rectangle myRec2 = new Rectangle(70,50,100,100);
        pen2D.setColor(Color.BLUE);
        pen2D.draw(myRec2);
        pen2D.fill(myRec2);
        
        Rectangle myRec3 = new Rectangle(120,100,100,100);
        pen2D.setColor(Color.MAGENTA);
        pen2D.draw(myRec3);
        pen2D.fill(myRec3);
        
        //text
    pen.drawString("This is my trio box", 10, 220);
   //draw a line
    Line2D.Double myLine = new Line2D.Double(10, 220, 150, 220);
    pen2D.draw(myLine);
    }
    
    
}
