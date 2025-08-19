/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;

/**
 *
 * @author Nthabi
 */
public class Enjoyment extends Applet {

   
    public Enjoyment(){
        this.addMouseListener(new MouseEvent());
    }
   
    
    @Override
    public void init() {
        //object of the class
    Font myFont = new Font("New Times Roma",Font.BOLD,20);
        setFont(myFont);
        //set background
        setBackground(Color.MAGENTA);
    }

    @Override
    public void paint(Graphics pen){
     Graphics2D pen2d = (Graphics2D)pen;
     
     pen2d.setColor(Color.BLUE);
     pen2d.drawString("I love you Musa Msimango", 10, 30);
     pen2d.setColor(Color.RED);
     pen2d.drawString("With all my heart*", 10,50);
    }
    
   public class MouseEvent implements MouseListener{

        @Override
        public void mouseClicked(java.awt.event.MouseEvent me) {
            System.out.println("Mouse was clicked");
            System.out.println("Coordinates:  ");
          
            repaint();
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
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent me) {
              System.out.println("Mouse was clicked");
             }
 
    
   }
}
