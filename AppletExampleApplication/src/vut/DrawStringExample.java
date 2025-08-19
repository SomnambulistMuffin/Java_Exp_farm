/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
import java.awt.*;
import java.applet.Applet;

/**
 *
 * @author st
 */
public class DrawStringExample extends Applet
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
        //creating an object of a class font
        Font myFont = new Font("Arial",Font.BOLD,24);
        // set background colour
        setForeground(Color.yellow);
        setBackground(Color.MAGENTA);
        //set font using the values from the instantiate
        setFont(myFont);
      
    }
    //method to draw everything that will be shown in frame
    @Override
  public void paint(Graphics gn){
      //specify colour
      gn.setColor(Color.WHITE);
      //create applet
     gn.drawString("THIS IS MY FIRST APPLET", 10, 30);
    gn.setColor(Color.WHITE);
     gn.drawString("This is my second text", 10, 50);
     
  }
  }
    // TODO overwrite start(), stop() and destroy() methods

