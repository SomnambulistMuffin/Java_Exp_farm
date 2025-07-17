/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import vut.data.StudentClass;

/**
 *
 * @author user
 */
public class MainMenuScreen extends JFrame
{
//DECLARING ALL MENUITEMS
    JMenuItem miaddStud,midisplay,misearch,micount,mihighest,miexit;
    //declaring menus
    JMenu mnFile,mnStud;
    //DECLARE ARRAYLIST 
    private ArrayList<StudentClass> arStud;
    public MainMenuScreen(){
        //CREATE ARRAYLIST OBJECT
        arStud=new ArrayList<>();
    //create menuitems objects
    miaddStud=new JMenuItem("Add New Stud");
    midisplay=new JMenuItem("Display All Stud Records");
    misearch=new JMenuItem("Search by Stud No");
    micount=new JMenuItem("Count Studs doing ASDSY3A Subj");
    mihighest=new JMenuItem("Get Stud with Highest Mark");
    miexit=new JMenuItem("Exit Application");
    //CREATE MENU OBJECTS AND ADD MENUITEMS TO MENU OBJECTS
    mnFile=new JMenu("File");
    //add items of this menu, according to order of appearance
    mnFile.add(misearch);
    mnFile.add(mihighest);
    mnFile.add(micount);
    mnFile.add(miexit);
    
    mnStud=new JMenu("Student");
    //add items of this menu, according to order of appearance
    mnStud.add(miaddStud);
    mnStud.add(midisplay);
    //CREATE MENUBAR OBJECTS AND ADD MENUS  TO MENUBAR OBJECTS
    JMenuBar jmb=new JMenuBar();
    //add menus in the menubar, according to order of appearance
    jmb.add(mnFile);
    jmb.add(mnStud);
    //CALL SETJMENUBAR METHOD, PASSING MENUBAR OBJECT - TO MAKE ALL MENUS/THEIR ITEMS APPEAR
        setJMenuBar(jmb);
        
     //REGISTER ALL MENUITEMS EVENTS 
     miaddStud.addActionListener(new miAddStudEvent());
     midisplay.addActionListener(new miDisplayEvent());
     misearch.addActionListener(new miSearchEvent());
     micount.addActionListener(new miCountEvent());
     mihighest.addActionListener(new miHighestEvent());
     miexit.addActionListener(new miExitEvent());
    }//end constructor
    
    //CREATE MENUITEMS EVENTS USING INNER CLASS FOR EACH MENUITEM
    //inner class to create addstud item event
    private class miAddStudEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            //CALLING STUDENT SCREEN TO OPEN
        StudInfo frm=new StudInfo(arStud);
        frm.setVisible(true);
        frm.setTitle("STUDENT SCREEN BY MS MNGOMA");
        frm.setSize(400,300);  
        frm.setResizable(false);//we want this screen to have a fixed size   
        }
    
    
    }//add item
      //inner class to create display item event
    private class miDisplayEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            //CALLING DISPLAY SCREEN TO OPEN
        DisplayScreen frm=new DisplayScreen(arStud);
        frm.setVisible(true);
        frm.setTitle("DISPLAY SCREEN BY MS MNGOMA");
        frm.setSize(400,300);
        frm.setResizable(false);//we want this screen to have a fixed size
            
        }
    
    
    }//display item
      //inner class to create search item event
    private class miSearchEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
          //CODE HERE- YOU JOB TO COMPLETE 
            //CORRECT CODE FOR SEARCH
            int pos=-1;
            String searchStuNo=JOptionPane.showInputDialog("Enter Stud No to search");
            boolean found=false;
            for (int i = 0; i < arStud.size(); i++)
            {
                if(arStud.get(i).getStdno().equals(searchStuNo)){
                pos=i;
                found=true;
                }
             
            }
            if(found){
            JOptionPane.showMessageDialog(null, arStud.get(pos).getStdno()+" found in pos: "+ pos);
            }
            else{
            JOptionPane.showMessageDialog(null,searchStuNo +" not found");
            }
        }
    
    
    }//search item
   
      //inner class to create highest item event
    private class miHighestEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
          //CODE HERE- YOU JOB TO COMPLETE  
            //CORRECT CODE TO GET STUD WITH HIGHEST MARK
            int pos=-1;
            int hmark=0;
            for (int i = 0; i < arStud.size(); i++)
            {
            if(arStud.get(i).getMarks()>hmark){
            hmark=arStud.get(i).getMarks();
            pos=i;
            }
            }
           JOptionPane.showMessageDialog(null,"Stud No: "+arStud.get(pos).getStdno()+" has the highest marks of: "+hmark);
        }
    
    
    }//highest item
    
      //inner class to create count item event
    private class miCountEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            //CODE HERE- YOU JOB TO COMPLETE
            //CORRECT CODE TO NUM OF STUDENTS DOING ASDSY3A
            int cntASDY3A=0;
             for (int i = 0; i < arStud.size(); i++)
            {
            if(arStud.get(i).getSubjcode().equals("ASDSY3A")){
            cntASDY3A+=1;
            }
            }
           JOptionPane.showMessageDialog(null,"No of studs in ASDSY3A: "+cntASDY3A); 
        }
    
    
    }//count item
    
      //inner class to create exit item event
    private class miExitEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
           int resp;
                    
           resp=JOptionPane.showConfirmDialog(null, "Do u want to exit?","Confirm",JOptionPane.YES_NO_OPTION);
           if(resp==JOptionPane.YES_OPTION){
               System.exit(0);
           }else
              
           mnStud.requestFocus();
           
        }
            
       }//exit item
    
    //execute this class
    public static void main(String[] args)
    {
        MainMenuScreen frm=new MainMenuScreen();
        frm.setVisible(true);
        frm.setTitle("MAIN MENU SCREEN BY MS MNGOMA");
        frm.setSize(400,300);
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }     
}
