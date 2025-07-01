/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;


import com.sun.xml.internal.stream.Entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import vut.data.EmployeeClass;

import java.io.*;
import java.util.Scanner;
import vut.data.DataStorageException;
import vut.data.NotFoundException;
/**
 *
 * @author Thaby
 */
public class MainMenuScreen extends JFrame{
private ArrayList<EmployeeClass> arEmp;
private static final String FILE_NAME="employeeFile.dat";
JMenuItem miExit, miWritetofile,miAdd,miView, miSearch,miHighest;
JMenu mnfile, mnEmp;
public MainMenuScreen()  {
//arEmp=new ArrayList<>();
        
miAdd=new JMenuItem("Add New Employee");
miView=new JMenuItem("View Employee Records");
miExit=new JMenuItem("Exit");
miWritetofile=new JMenuItem("Write to file");
miSearch=new JMenuItem("Search Employee Name");
miHighest=new JMenuItem("Highest Earned Employee"); 

//items listeners
  miAdd.addActionListener(new miAddEvent());
  miView.addActionListener(new miViewEvent());
  miExit.addActionListener(new miExitEvent());
  miWritetofile.addActionListener(new miWritetofileEvent());
  miSearch.addActionListener(new miSearchEvent());
  miHighest.addActionListener(new miHighestEvent());
  
    addWindowListener(new windowListenersEvent());
  //creating menus
         mnfile=new JMenu("File");
       mnfile.add(miHighest);
        mnfile.add(miSearch);
        mnfile.add(miExit);
        mnfile.add(miWritetofile);
         mnEmp=new JMenu("Employees");
        
        mnEmp.add(miAdd);
        mnEmp.add(miView);
        mnfile.add(miSearch);
        mnfile.add(miHighest);
     //create menu bar and add menus to menu bar
        JMenuBar jmBar=new JMenuBar();
        jmBar.add(mnfile);
        jmBar.add(mnEmp);
        
        //set menu bar
        setJMenuBar(jmBar);
     // readFromFile();
       try{
     EmployeeClass.initialize();
     }catch(DataStorageException ex)  {
     JOptionPane.showMessageDialog(null, ex.getMessage());
     } 
    
}
    private class miAddEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
         EmployeeGui frm=new EmployeeGui(arEmp);
       
    frm.setTitle("EMPLOYEE SCREEN");
    frm.setSize(500, 300);
    
   frm.setResizable(false);
    frm.setVisible(true); 
        }


}
    private class miViewEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
       ViewEmployees frm=new ViewEmployees(arEmp);
       
    frm.setTitle("VIEW EMPLOYEES SCREEN - BY MS MNGOMA");
    frm.setSize(500, 300);
    
   frm.setResizable(false);
    frm.setVisible(true); 
        }


}
private class miSearchEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
//            String search=JOptionPane.showInputDialog("Enter Emp Name to Search:");
//            findEmployee(search);
            
             String search=JOptionPane.showInputDialog("Enter Emp Name to Search:");
            //findEmployee(search);
            try{
            EmployeeClass emp=EmployeeClass.findEmp(search);
            JOptionPane.showMessageDialog(null,emp);
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }


}
private class miHighestEvent implements ActionListener{
NumberFormat curr=NumberFormat.getCurrencyInstance();
        @Override
        public void actionPerformed(ActionEvent ae) {
//       int pos=getHighestEmployee();
//       JOptionPane.showMessageDialog(null, "Employee name: "+arEmp.get(pos).getName()+" earn highest salary of:  "+curr.format(arEmp.get(pos).monthlySalary()) );
       
        
        String search=JOptionPane.showInputDialog("Enter Emp Name to Search:");
        String upname=JOptionPane.showInputDialog("Enter new Name to delete:");
            try{
            EmployeeClass emp=EmployeeClass.findEmp(search);
           // emp.updateNm(upname);
            emp.deleteEmp();
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }


}
private class miExitEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
//                   int resp;
//           resp=JOptionPane.showConfirmDialog(null, "Do u want to exit?","Confirm",JOptionPane.YES_NO_OPTION);
//           if(resp==JOptionPane.YES_OPTION){
//              
//               saveTofile();
//                System.exit(0);
//           }else
//              
//           mnEmp.requestFocus();
          
           
            try{
                 int resp;
           resp=JOptionPane.showConfirmDialog(null, "Do u want to exit?","Confirm",JOptionPane.YES_NO_OPTION);
           if(resp==JOptionPane.YES_OPTION){
                EmployeeClass.terminate();
               System.exit(0);
              
           }else
              
           mnEmp.requestFocus();
         }catch(DataStorageException ex)  {
         JOptionPane.showMessageDialog(null, ex.getMessage());
         } 
        }


}
private class miWritetofileEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
       try{
       FileWriter wfile=new FileWriter("Employees.txt");
       PrintWriter pwriter=new PrintWriter(wfile);
       for(int x=0;x<arEmp.size();x++){
       pwriter.println(arEmp.get(x).toString());
       }
       pwriter.close();
       }catch(IOException ex){
           System.out.println(ex.getMessage());
       }
           
        }


}
private class windowListenersEvent extends WindowAdapter{
@Override
public  void windowClosing(WindowEvent we){
//saveTofile();
}
}

    
    public static void main(String[] args) {
      MainMenuScreen    fMenu=new MainMenuScreen();
        fMenu.setSize(500,500);
        fMenu.setTitle("MAIN MENU - BY MS MNGOMA ");
        fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fMenu.setVisible(true);   
        
    }
    //searching
  public  void findEmployee(String searchNm){
    int pos=-1;   
        for (int i = 0; i < arEmp.size(); i++) {
           if(arEmp.get(i).getName().equals(searchNm)){
           pos=i;
           }
                   
        }
        if(pos==-1){
              JOptionPane.showMessageDialog(this,searchNm+" dont exist." );
            
        }else{
            
           JOptionPane.showMessageDialog(this,arEmp.get(pos).toString() );
           
        }
     
    }//ddn 
 
  //highest
 public  int getHighestEmployee(){
    int posx = -1;double highest=0;
    for (int i = 0; i < arEmp.size(); i++) {
       
        if(arEmp.get(i).monthlySalary()>highest ){
         highest=arEmp.get(i).monthlySalary();
         posx=i;
     
        }
     
     }
    return posx;
      }
 

 
 
 //must be called on the exit menu
   public void saveTofile(){
   try{
       FileOutputStream fos=new FileOutputStream(FILE_NAME);
   ObjectOutputStream objWrite=new ObjectOutputStream(fos);
   
  objWrite.writeObject( arEmp);
  
  objWrite.close();
   }catch(IOException ex){
       System.out.println(ex.getMessage());
   }
   } 
  // must be called within the constructor
   public void readFromFile(){
   try{
       FileInputStream fis=new FileInputStream(FILE_NAME);
       ObjectInputStream objRead=new ObjectInputStream(fis);
       arEmp=(ArrayList<EmployeeClass>)objRead.readObject();
       objRead.close();
   }catch(FileNotFoundException ex){
       JOptionPane.showMessageDialog(null,"No data in the file "+ex.getMessage());
       arEmp=new ArrayList<>();
   }catch(IOException ex){
   JOptionPane.showMessageDialog(null, ex.getMessage());
   }catch(ClassNotFoundException ex){
     JOptionPane.showMessageDialog(null, ex.getMessage());
   }
   }
   

}
