/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author st
 */
public class OlympicLogoImage extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        
        setForeground(Color.red);
        Font myF = new Font("Arial",Font.BOLD,18);
        setFont(myF);
        setSize(500,500);
    }

    // TODO overwrite start(), stop() and destroy() methods
    
    @Override
    
    public void paint (Graphics g){
        
        g.drawString("The Olympic Logo", 10,20);
        
        g.setColor(Color.red);
        g.drawLine(10, 40, 200, 40);
        
        g.setColor(Color.blue);
        g.drawOval(10, 60, 200, 200);
        
        g.setColor(Color.black);
        g.drawOval(250, 60, 200, 200);
        
        g.setColor(Color.red);
        g.drawOval(490, 60, 200, 200);
        
        g.setColor(Color.yellow);
        g.drawOval(125, 150, 200, 200);
        
        g.setColor(Color.green);
        g.drawOval(365, 150, 200, 200);
    }
}
