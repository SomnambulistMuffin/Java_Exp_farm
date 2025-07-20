/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author st
 */
public class AddScreen extends JFrame
{

    public AddScreen()
    {
        JLabel lbl = new JLabel("Add componnents");
        Container screen =  getContentPane();
        screen.setLayout(new BorderLayout());
        screen.add(lbl,BorderLayout.CENTER);
        
    }
}
