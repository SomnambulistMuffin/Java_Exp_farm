/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;


/**
 *
 * @author Nthabi
 */
public class MyHouseCl extends Applet {

    private House objHouse;
    private int x,y,w,h;
    
    public MyHouseCl(){
   x= Integer.parseInt(JOptionPane.showInputDialog("Enter x coordinates"));
   y= Integer.parseInt(JOptionPane.showInputDialog("Enter Y coordinates"));
   w= Integer.parseInt(JOptionPane.showInputDialog("Enter  the recWidth "));
   h= Integer.parseInt(JOptionPane.showInputDialog("Enter the recHeight "));
 
   objHouse = new House(x,y,w,h);
   
    }
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics pen){
     Graphics2D pen2D = (Graphics2D)pen;
     objHouse.displayHouse(pen2D);
    }
    }

