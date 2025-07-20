/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author st
 */
public class ViewScreen extends JFrame
{
     public ViewScreen()
    {
        JTextArea txtArea = new JTextArea();
        txtArea.setEditable(false);
        Container screen = getContentPane();
        screen.setLayout(new BorderLayout());
        screen.add(txtArea,BorderLayout.CENTER);
        
    }

}
