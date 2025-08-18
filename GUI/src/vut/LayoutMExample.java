/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author st
 */
public class LayoutMExample extends JFrame implements ActionListener
{

    private JButton b1, b2, b3, b4, b5, b6;

    //constructor
    public LayoutMExample()
    {
        b1 = new JButton("ONE");
        b2 = new JButton("TWO");
        b3 = new JButton("THREE");
        b4 = new JButton("FOUR");
        b5 = new JButton("FIVE");
        b6 = new JButton("SIX");

        //set text
        //setText("GUI LAYOUT MANAGER - BY MS MGOMA");
        //CONTAINER/PANE;
        Container screen = getContentPane();
        //creating the rows and columns in the fame / 2 is the row and 3 is the colum
        screen.setLayout(new GridLayout(2, 3));
        //adding the buttons of the frame
        screen.add(b1);
        screen.add(b2);
        screen.add(b3);
        screen.add(b4);
        screen.add(b5);
        screen.add(b6);
        //setting the size of the frame
        setSize(400, 400);
        //CLOSE THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //SHOW THE FRAME
        setVisible(true);
        //calls the listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        //getSource specify a particular button
        if (ae.getSource() == b1)
        {
            JOptionPane.showMessageDialog(this, "btn1,message");
        }
        if (ae.getSource() == b2)
        {
            JOptionPane.showMessageDialog(this, "btn2,message");
        }
        if (ae.getSource() == b3)
        {
            JOptionPane.showMessageDialog(this, "btn2,message");

        }
        if (ae.getSource() == b4)
        {
            JOptionPane.showMessageDialog(this, "btn2,message");
        }
        if (ae.getSource() == b5)
        {
            JOptionPane.showMessageDialog(this, "btn2,message");
        }
        if (ae.getSource() == b6)
        {
            JOptionPane.showMessageDialog(this, "btn2,message");
        }
}
}