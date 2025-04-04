package vut;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


/**
 *
 * @author DeOxy
 */
public class house extends Applet {

    public void init() {
        setForeground(Color.red);
        Font myFnt = new Font("Arial", Font.BOLD, 14);
        setFont(myFnt);
        resize(500,500);
    }
    
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        
        //roof
        g2D.setColor(Color.green);
        g2D.setStroke(new BasicStroke(5));
        Line2D left = new Line2D.Double(50,50 ,22,100);
        Line2D rgt = new Line2D.Double(280, 50,318,100);
        Line2D top = new Line2D.Double(50, 50,280,50);
        g2D.draw(left);
        g2D.draw(top);
        g2D.draw(rgt);
        
        //wallg2
        Rectangle2D wall = new Rectangle2D.Double(20, 100, 300, 200);
        g2D.setColor(Color.orange);
        g2D.fill(wall);
        
        //door
        Rectangle2D door = new Rectangle2D.Double(160, 170, 80, 130);
        g2D.setColor(Color.BLUE);
        g2D.fill(door);
        g2D.setColor(Color.RED);
        g2D.drawString("PROPERTY 24 AGENCY ADVERTISERS",45,95);
        
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
