/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author st
 */
public class CircleShapes extends Applet
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init()
    {
        Font myFont = new Font("Arial",Font.ITALIC,18);
        setFont(myFont);
    }

    @Override
    public void paint(Graphics pen){
  
     //Assign a graphic to graphics2d
        Graphics2D pen2D = (Graphics2D) pen;
        
        Ellipse2D.Double myCircle1,myCircle2,myCircle3;
        
        myCircle1 = new Ellipse2D.Double(10,20,100,100);
        pen2D.setColor(Color.RED);
        pen2D.draw(myCircle1);
        pen2D.fill(myCircle1);
        
         myCircle2 = new Ellipse2D.Double(80,20,100,100);
        pen2D.setColor(Color.BLUE);
        pen2D.draw(myCircle2);
        pen2D.fill(myCircle2);
        
        
         myCircle3 = new Ellipse2D.Double(150,20,100,100);
        pen2D.setColor(Color.MAGENTA);
        pen2D.draw(myCircle3);
        pen2D.fill(myCircle3);
        
        //text
        pen.drawString("This is my Trio circles", 20, 140);
        //draw a line
        Line2D.Double myStartLine=new Line2D.Double(10, 140, 200, 140);
        pen2D.draw(myStartLine);
        
      
        
        
                
    }
}
