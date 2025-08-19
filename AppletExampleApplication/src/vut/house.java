/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.geom.Line2D;

/**
 *
 * @author Nthabi
 */
public class house extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics pen) {

    }

    Draw lines;
    Line2D.Double myLine1 = new Line2D.Double(10, 45, 50, 25);

    pen2D.draw (myLine1);
    Line2D.Double myLine2 = new Line2D.Double(50, 55, 60, 65);

    pen2D.draw (myLine2);

}
