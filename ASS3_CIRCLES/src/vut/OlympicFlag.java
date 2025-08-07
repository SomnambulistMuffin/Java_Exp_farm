/*     
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author 215171438
 */
public class OlympicFlag extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics pen){
        
    int x=100;
    int y=200;
    int w=150;
    int h=150;
    
    Graphics2D pen2D = (Graphics2D)pen;
    Ellipse2D.Double circle1,circle2,circle3,circle4,circle5;
    
    circle1=new Ellipse2D.Double(x, y,w, h);
    circle2=new Ellipse2D.Double(x+w+15, y, w, h);
    circle3=new Ellipse2D.Double(x+w+x+(w/2)+5,y, w, h);
    circle4=new Ellipse2D.Double(x+15+(w/2),y+(y/2), x+x/2-10, h);
    circle5= new Ellipse2D.Double(x+15+w+88,y+(y/2)+5,  x+x/2-10, h);
    
    pen2D.setColor(Color.BLUE);
    pen2D.draw(circle1);
    pen2D.setColor(Color.BLACK);
    pen2D.draw(circle2);
    pen2D.setColor(Color.RED);
    pen2D.draw(circle3);
    pen2D.setColor(Color.yellow);
    pen2D.draw(circle4);
    pen2D.setColor(Color.GREEN);
    pen2D.draw(circle5);
    }
    }
