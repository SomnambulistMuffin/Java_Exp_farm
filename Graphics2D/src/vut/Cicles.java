/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 *
 * @author st
 */
public class Cicles extends Applet
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
        Ellipse2D.Double myCircle1, myCircle2, myCircle3;
        Line2D.Double myLine;

        Graphics2D pen2D = (Graphics2D) pen;

        myCircle1 = new Ellipse2D.Double(x, y, 100, 100);
        myCircle2 = new Ellipse2D.Double(x *5, y, 100, 100);
        myCircle3 = new Ellipse2D.Double(x * 10, y, 100, 100);
        myLine = new Line2D.Double(x, y * 9, x * 20, y * 9);
        
        pen2D.setColor(Color.RED);
        pen2D.setFont(myFont);
        
        pen2D.draw(myCircle1);
        pen2D.fill(myCircle2);
        pen2D.draw(myCircle3);
        
        pen2D.drawString("This are my Circles", x ,y*8 );
        pen2D.draw(myLine);
    }

}
