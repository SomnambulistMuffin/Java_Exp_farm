/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import vut.data.*;

/**
 *
 * @author admin
 */
public class HomeScreen extends JFrame
{

    JMenuItem misearch,mihighest,micount,miexit,miAddStud,miDisp;  
  JMenu mnFile,mnStud;
  private static ArrayList<Student> arStud;
  //constructor
  public HomeScreen(){
      //create arraylist object
      arStud=new ArrayList<>();
  //create objects for all menu items
  misearch=new JMenuItem("Search Stud by name");
  mihighest=new JMenuItem("Update");//"Stud with Highest SMark"
  micount=new JMenuItem("Delete");//Count No of Stud with Distinctions
  miexit=new JMenuItem("Exit Application");
  miAddStud=new JMenuItem("Add New Stud");
  miDisp=new JMenuItem("Display All Students");
  
  // create menu objects and add all menu items in their respective menus
  mnFile=new JMenu("File");
  mnFile.add(misearch);
  mnFile.add(mihighest);
  mnFile.add(micount);
  mnFile.add(miexit);
  mnStud=new JMenu("Student");
  mnStud.add(miAddStud);
  mnStud.add(miDisp);
  
  //create menu bar object and add menus in the menu bar
  JMenuBar jmb=new JMenuBar();
  jmb.add(mnFile);
  jmb.add(mnStud);
  
  //set menu bar in order to see all objects created 
      setJMenuBar(jmb);
      
      //register menu items events
  miAddStud.addActionListener(new miAddstudEvent());
  miDisp.addActionListener(new miDisplayEvent());
  miexit.addActionListener(new miExitEvent());
  misearch.addActionListener(new miSearchEvent());
  mihighest.addActionListener(new miHighEvent());//update
  micount.addActionListener(new miCountEvent());//delete
  //call pd method to initialize
  try{
  Student.initialize();
  }catch(DataStorageException ex){
  JOptionPane.showMessageDialog(null, ex.getMessage());
  }
  
  }
  //inner class Add Stud menu item
  private class miAddstudEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
           StudScreen frm=new StudScreen(arStud);
           frm.setTitle("STUDENT SCREEN");
           frm.setSize(400, 300);
           frm.setResizable(false);
           frm.setVisible(true);
            
            
        }
  
  }
   //inner class for Display menu item
  private class miDisplayEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
           DisplayScreen frm=new DisplayScreen(arStud);
           frm.setTitle("DISPLAY SCREEN");
           frm.setSize(500, 300);
           frm.setResizable(false);
           frm.setVisible(true);
            
            
        }
  
  }
   //inner class for exit menu item
  private class miExitEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try{
           int resp;
           resp=JOptionPane.showConfirmDialog(null, "Do u want to exit?","Confirm",JOptionPane.YES_NO_OPTION);
           
           if(resp==JOptionPane.YES_OPTION){
               Student.terminate();
           System.exit(0);
           }else{
           mnStud.requestFocus();
           
           }
            }catch(DataStorageException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            
        }
  
  }
     //inner class for search menu item
  private class miSearchEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try{
                String search=JOptionPane.showInputDialog("Enter name to search");
                Student st=Student.findStud(search);
                JOptionPane.showMessageDialog(null,st);
           
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            
        }
  
  }
  
       //inner class for high menu item -temp update
  private class miHighEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try{
                String search=JOptionPane.showInputDialog("Enter name to search");
                String asubj=JOptionPane.showInputDialog("Enter new subj");
                Student st=Student.findStud(search);
                st.updateSubj(asubj);
             
           
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            
        }
  
  }
       //inner class for count menu item -temp delete
  private class miCountEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try{
                String search=JOptionPane.showInputDialog("Enter name to search");
                String asubj=JOptionPane.showInputDialog("Enter subj delete");
                Student st=Student.findStud(search);
                st.deleteSubj(asubj);
             
           
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            
        }
  
  } 
  
    public static void main(String[] args)
    {
        HomeScreen frm=new HomeScreen();
        frm.setTitle("HOME SCREEN");
        frm.setSize(600, 600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    
}
