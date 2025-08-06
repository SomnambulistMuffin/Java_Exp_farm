/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author 215171438
 */
public class OlympicCircles extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics g) {
        int x = 150;
        int y = 100;
        int w = 150;
        int h = 150;

        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double c1,c2,c3,c4,c5;

        c1 = new Ellipse2D.Double(x, y, w, h);
        c2 = new Ellipse2D.Double((x+w+15),y,w,h);
        c3 = new Ellipse2D.Double((x+w+15+w+15),y,w,h);
        c4 = new Ellipse2D.Double(x+w-(x/2)+(15/2), (y+h)-(y/2), w, h);
        c5 = new Ellipse2D.Double((x+w+15+w+15)-83, (y+h)-(y/2), w, h);
     
        g2.setColor(Color.BLUE);
        g2.draw(c1);
        g2.setColor(Color.BLACK);
        g2.draw(c2);
        g2.setColor(Color.red);
        g2.draw(c3);
        g2.setColor(Color.YELLOW);
        g2.draw(c4);
        g2.setColor(Color.GREEN);
        g2.draw(c5);
        
        
    }
}
