/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import vut.data.*;
/**
 *
 * @author Thaby
 */
public class MainMenuScreen extends JFrame{
private ArrayList<EmployeeClass> arEmp;
JMenuItem miExit,miAdd,miView, miSearch,miDelete,miUpdate;
JMenu mnfile, mnEmp;
public MainMenuScreen()  {
arEmp=new ArrayList<>();
        
miAdd=new JMenuItem("Add New Employee");
miView=new JMenuItem("View Employee Records");
miExit=new JMenuItem("Exit");
miSearch=new JMenuItem("Search Employee Name");
miDelete=new JMenuItem("Delete Employee Record"); 
miUpdate=new JMenuItem("Update Employee Phone No"); 

//items listeners
  miAdd.addActionListener(new miAddEvent());
  miView.addActionListener(new miViewEvent());
  miExit.addActionListener(new miExitEvent());
  miSearch.addActionListener(new miSearchEvent());
  miDelete.addActionListener(new miDeleteEvent());
  miUpdate.addActionListener(new miUpdateEvent());
  
  //creating menus
         mnfile=new JMenu("File");
       
        mnfile.add(miSearch);
        mnfile.add(miDelete);
        mnfile.add(miUpdate);
        mnfile.add(miExit);
        
         mnEmp=new JMenu("Employees");
        
        mnEmp.add(miAdd);
        mnEmp.add(miView);
        
//        mnfile.add(miSearch);
//        mnfile.add(miDelete);
     //create menu bar and add menus to menu bar
        JMenuBar jmBar=new JMenuBar();
        jmBar.add(mnfile);
        jmBar.add(mnEmp);
        
        //set menu bar
        setJMenuBar(jmBar);
        
        try{
        EmployeeClass.terminate();
        }catch(DataStorageException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private class miAddEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
         EmployeeGui frm=new EmployeeGui(arEmp);
       
    frm.setTitle("ADD EMPLOYEE SCREEN");
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
            try{
            String search=JOptionPane.showInputDialog("Enter Emp Name to Search:");
            EmployeeClass objemp=EmployeeClass.findEmp(search);
            JOptionPane.showMessageDialog(null,objemp);
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }//act


}//search

private class miDeleteEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try{
            String search=JOptionPane.showInputDialog("Enter Emp Name to Search:");
            EmployeeClass objemp=EmployeeClass.findEmp(search);
            objemp.deleteEmp();
            }catch(NotFoundException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }//act
}//delete
private class miUpdateEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
      
       //code for update
       try{
       String search=JOptionPane.showInputDialog("Enter Emp Name to Search:");
       String newphone=JOptionPane.showInputDialog("Enter new phoneno:");
       EmployeeClass objemp=EmployeeClass.findEmp(search);
       
       objemp.updatePhone(newphone);
       }catch(NotFoundException ex){
       JOptionPane.showMessageDialog(null,ex.getMessage());
       }
        }//act


}//update
private class miExitEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try{
                   int resp;
           resp=JOptionPane.showConfirmDialog(null, "Do u want to exit?","Confirm",JOptionPane.YES_NO_OPTION);
           if(resp==JOptionPane.YES_OPTION){
               EmployeeClass.terminate();
               System.exit(0);
           }else
              
           mnEmp.requestFocus();
           
        }catch(DataStorageException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
        }//exit
        



    
    public static void main(String[] args) {
      MainMenuScreen    fMenu=new MainMenuScreen();
        fMenu.setSize(500,500);
        fMenu.setTitle("MAIN MENU - BY MS MNGOMA ");
        fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fMenu.setVisible(true);   
        
    }
    
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
    
}
