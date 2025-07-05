/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author st
 */
public class layoutManager extends JFrame implements ActionListener
{

    JButton b1, b2, b3, b4, b5;

    public layoutManager()
    {
        b1 = new JButton("one");
        b2 = new JButton("two");
        b3 = new JButton("three");
        b4 = new JButton("four");
        b5 = new JButton("five");

        Container frm = getContentPane();

        //FlOW LAYOUT
        frm.setLayout(new FlowLayout());
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);

        //GRID LAYOUT
//        frm.setLayout(new GridLayout(3, 2));
//
//        frm.add(b1);
//        frm.add(b2);
//        frm.add(b3);
//        frm.add(b4);
//        frm.add(b5);



//BORDER LAYOUT
        //frm.setLayout(new BorderLayout());
//        frm.setLayout(new BorderLayout());
//        frm.add(b1, BorderLayout.EAST);
//        frm.add(b2, BorderLayout.WEST);
//        frm.add(b3, BorderLayout.NORTH);
//        frm.add(b4, BorderLayout.SOUTH);
//        frm.add(b5, BorderLayout.CENTER);
        //set size applying width and height of the frame
        //always write title with your name
        setTitle("Layout Manager");
        setSize(400, 300); //of the frame

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1)
        {
            JOptionPane.showMessageDialog(this, "You have clicked the first button");
        }
        else if (ae.getSource() == b2)
        {
            JOptionPane.showMessageDialog(this, "You have clicked the second button");
        }
        else if (ae.getSource() == b3)
        {
            JOptionPane.showMessageDialog(this, "You have clicked the three button");
        }
        else if (ae.getSource() == b4)
        {
            JOptionPane.showMessageDialog(this, "You have clicked the four button");
        }
        else if (ae.getSource() == b5)
        {
            JOptionPane.showMessageDialog(this, "You have clicked the fifth button");
        }
    }
}
