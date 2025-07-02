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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author KC MATSINDE 215270827
 * 
 */
public class kiteApplet extends Applet {

    private int r, g, b;
    private Kite kite;
    private Color color;
    private int clickCounter;
    
    
    public kiteApplet(){
        
        r = Integer.parseInt(JOptionPane.showInputDialog("Enter red value:"));
        g = Integer.parseInt(JOptionPane.showInputDialog("Enter green value:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter blue value:"));

        try {
         
            color = new Color(r, g, b);
        } catch (IllegalArgumentException e) {
            color = Color.blue;
        }
        clickCounter = 0;
        kite = null;

       
        }
    public void init() {
        // TODO start asynchronous download of heavy resources
         setSize(500, 500);
          this.addMouseListener(new kiteHandler());
    }
      @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        if (kite != null) {
            kite.DisplayKite(g2);
        }
    }

    private class kiteHandler implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getClickCount() > 1){
             if (e.getButton() == MouseEvent.BUTTON1){
              kite.setSize(20);
             }else if (e.getButton() == MouseEvent.BUTTON3) {
                    kite.setSize(-15);
            
            }
        }
            repaint();
        }
        
        

        @Override
        public void mousePressed(MouseEvent e) {

          if (e.getClickCount() == 1){
            
            kite = new Kite();
                kite.setLength(45);
                kite.setColor(color);
                repaint();
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    
    
    }
    
}
