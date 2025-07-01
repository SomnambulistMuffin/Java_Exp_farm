/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import vut.data.EmployeeClass;

/**
 *
 * @author Thaby
 */
public class ViewEmployees extends JFrame{
    JTextArea taView=new JTextArea();
    public ViewEmployees(ArrayList<EmployeeClass> arEmp){
    
        taView.setEditable(false);
        Container scrn=getContentPane();
        scrn.setLayout(new BorderLayout());
        scrn.add(taView,BorderLayout.CENTER);
        displayEmployees(arEmp);
    }
      public void displayEmployees(ArrayList<EmployeeClass> arEmp){
                    String aname=JOptionPane.showInputDialog("Enter Name:");
          if(aname.isEmpty()){
        arEmp= EmployeeClass.getAll();
          }else{
        arEmp=  EmployeeClass.getAll(aname);
          }
       taView.append("No of Loaded data: "+arEmp.size()+"\n");   
       taView.append("Emp Name\t"+"Anual Salary\t"+"Monthly Salary\t"+"Increment Salary"+"\n");
   for(int x=0;x<arEmp.size();x++){
    taView.append(arEmp.get(x).toString()+"\n");
   
   
   }
   }
    
}
