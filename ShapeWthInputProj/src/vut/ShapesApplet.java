/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author Thaby
 */
public class ShapesApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private Shapes objShapes;
    int x,y,rw,rh;
    public ShapesApplet(){
    
    x=Integer.parseInt(JOptionPane.showInputDialog("Enter x coordinate"));
    y=Integer.parseInt(JOptionPane.showInputDialog("Enter y coordinate"));
    rw=Integer.parseInt(JOptionPane.showInputDialog("Enter rec width"));
    rh=Integer.parseInt(JOptionPane.showInputDialog("Enter rec height"));
    objShapes=new Shapes(x,y,rw,rh);
  //  this.addMouseListener(new MouseHandler());//call AddMouseListener method of a class MouseListener  to be handled
    
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
public void paint(Graphics g){
    

Graphics2D g2=(Graphics2D) g;
objShapes.displayShape(g2);
}
    // TODO overwrite start(), stop() and destroy() methods

private class MouseHandler implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            System.out.println("Mouse clicked at coordinate:");
            System.out.println("X: "+me.getX());
            System.out.println("Y: "+me.getY());
            objShapes.setMyX(me.getX());
            objShapes.setMyY(me.getY());
          // repaint(me.getX(), me.getY(), rw,rh);
           //changing size of the rect to square
           // repaint(me.getX(), me.getY(), 100,100);
           repaint();
        }

        @Override
        public void mousePressed(MouseEvent me) {
            System.out.println("Pressed"); 
             System.out.println("X: "+me.getX());
            System.out.println("Y: "+me.getY());
            
           repaint(me.getX(), me.getY(),100, 100);
        }

        @Override
        public void mouseReleased(MouseEvent me) {
           System.out.println("Released");  
        }

        @Override
        public void mouseEntered(MouseEvent me) {
          System.out.println("enterd");   
        }

        @Override
        public void mouseExited(MouseEvent me) {
            System.out.println("Exited");
        }

}
}
