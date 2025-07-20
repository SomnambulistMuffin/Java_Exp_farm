/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author st
 */
public class MainMenu extends JFrame
{
    JMenuItem miAdd, miView, miExit;
    public MainMenu() {
        // public ArrayList<Student> arrStudent = new ArrayList<>();
    // create menu items
        miAdd= new JMenuItem("Add Screen");
        miView = new JMenuItem("View Screen");
        miExit = new JMenuItem("Exit");
        
        // add listers to menu items
        miAdd.addActionListener(new MiAddEvent());
        miView.addActionListener(new MiViewEvent());
        miExit.addActionListener(new MiExitEvent());
        
        // create menus
        JMenu mnFile = new JMenu("File");
        JMenu mnInfo = new JMenu("Information");
        
        mnFile.add(miExit);
        mnInfo.add(miAdd);
        mnInfo.add(miView);
        
        // create menu bar
        JMenuBar jmBar = new JMenuBar();
        
        // add menu to menu bar
        jmBar.add(mnFile);
        jmBar.add(mnInfo);
        
        // set menu bar 
        setJMenuBar(jmBar);
        
    }
    
    private class MiAddEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            AddScreen scrnAdd =  new AddScreen();
            scrnAdd.setSize(300,300);
            scrnAdd.setTitle("Add screen");
            scrnAdd.setResizable(false);
            scrnAdd.setVisible(true);
            
        }

        
        
    }
    
    private class MiViewEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            ViewScreen scrnView =  new ViewScreen();
            scrnView.setSize(300,300);
            scrnView.setTitle("Add screen");
            scrnView.setResizable(false);
            scrnView.setVisible(true);
        }

      
        
    }
    
    private class MiExitEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
           dispose();
           System.exit(0);
        }

       
        
    }
    public static void main(String[] args)
    {
       MainMenu mMenu = new MainMenu();
       mMenu.setSize(500, 500);
       mMenu.setTitle("Main Form");
       mMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mMenu.setVisible(true);
    }
    
}
