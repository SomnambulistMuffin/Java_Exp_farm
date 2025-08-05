/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Nthabi
 */
public class MyHouseCl extends Applet {

    //coordinates of the house
    // int x = 250;
    // int y = 200;
    // int w = 500;
    // int h = 300;
    private House objHouse;
    private int x, y, w, h;

    public MyHouseCl() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter x coordinates"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter Y coordinates"));
        w = Integer.parseInt(JOptionPane.showInputDialog("Enter  the recWidth "));
        h = Integer.parseInt(JOptionPane.showInputDialog("Enter the recHeight "));

        objHouse = new House(x, y, w, h);
        
   this.addMouseListener(new MouseEvent());
  

    }

    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics pen) {
        Graphics2D pen2D = (Graphics2D) pen;
        objHouse.displayHouse(pen2D);
    }

    public class MouseEvent implements MouseListener {

        @Override
        public void mouseClicked(java.awt.event.MouseEvent me) {
            System.out.println("Mouse was clicked");
            System.out.println("Coordinates");
            System.out.println(" X :" + me.getX());
            System.out.println(" Y:" + me.getY());

            objHouse.setX(me.getX());
            objHouse.setY(me.getY());
            
             repaint(me.getX(),me.getY(),w,h);

        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent me) {
            System.out.println("Mouse was pressed");
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent me) {
            System.out.println("Mouse was released");

        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent me) {
            System.out.println("Mouse was Entered");

        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent me) {
            System.out.println("Mouse was exited");

        }

    }
}
