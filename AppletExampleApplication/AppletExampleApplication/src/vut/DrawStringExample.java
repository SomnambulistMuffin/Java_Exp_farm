/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author TA Mathebe 000000000
 */
public class DrawStringExample extends Applet
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
        /*
        To change the Font, first create an object for Font class and give it values
        */
        Font myFont = new Font("Arial",Font.BOLD,16);
        // setForeground(Color.red);
        setBackground(Color.blue);
        setFont(myFont);
       
    }

    /* 
    method to draw everything that will be shown in frame
    @para Graphics with a variable 
    */
    public void paint(Graphics g2)
    {
        g2.setColor(Color.white);
        g2.drawString("My First Text", 10, 20);
        g2.setColor(Color.white);
        g2.drawString("My Second Text", 10, 40);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
