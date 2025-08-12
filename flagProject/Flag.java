/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.flagClass;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Khosa R 215268172
 */
public class Flag extends Applet {

   private int x, y, w, h;
    public flagclass objrectClass;

    public Flag() {

     
        objrectClass = new flagclass(x, y, w, h);
   
    }
    
    

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
     @Override
    public void init() {
        // TODO start asynchronous download of heavy resources

        setBackground(Color.white);
        Font myt = new Font("Arial", Font.BOLD, 18);
        setFont(myt);
    }
    @Override
    public void paint(Graphics g){
    
    Graphics2D g2=(Graphics2D)g;
    objrectClass.myrect(g2);}

    // TODO overwrite start(), stop() and destroy() methods
}
