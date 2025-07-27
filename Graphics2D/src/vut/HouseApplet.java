/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 *
 * @author st
 */
public class HouseApplet extends Applet
{

    @Override
    public void init()
    {

    }

    @Override
    public void paint(Graphics pen)
    {
        int x = 100;
        int y = 100;
        int w = 400;
        int h = 300;
        Graphics2D pen2D = (Graphics2D) pen;
        Rectangle house, garage, door, car;
        Line2D.Double hLineLeft, hLineRight, carLineLeft, carLineRight, houseStraight, carStraight;

        house = new Rectangle(x, y, w, h);
        hLineLeft = new Line2D.Double(x, y, x + (x / 2), y - (h / 4));
        hLineRight = new Line2D.Double((x + w) - (x / 2), y - (h / 4), (x + w), y);
        houseStraight = new Line2D.Double(x + (x / 2), y - (h / 4), (x + w) - (x / 2), y - (h / 4));
        
        door=new Rectangle(x+(w/4), y+(h/2), x+(w/4), h/2);
        garage=new Rectangle((x+w), y, w/2, h-y/2);
        
        pen2D.setColor(Color.RED);
        pen2D.draw(house);
        pen2D.draw(hLineLeft);
        pen2D.draw(hLineRight);
        pen2D.draw(houseStraight);
        pen2D.draw(door);
        pen2D.draw(garage);
    }

}
