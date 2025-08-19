/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author st
 */
public class DrawShapes extends Applet
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
    }

    /* 
     method to draw everything that will be shown in frame
     @para Graphics with a variable 
     */
    public void paint(Graphics g3)
    {
        g3.drawRect(10, 20, 50, 25);
        g3.drawRect(100, 20, 50, 25);
    }
}
