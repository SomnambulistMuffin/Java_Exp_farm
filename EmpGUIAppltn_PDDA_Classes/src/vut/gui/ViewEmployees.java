/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.*;
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
       String phonecode=JOptionPane.showInputDialog("Enter phone code:");
       if(phonecode.isEmpty()){
           arEmp=EmployeeClass.getAllEmp();
       
       }else{
       arEmp=EmployeeClass.getAllEmp(phonecode);
       }
       taView.append("No of records is: "+ arEmp.size());
       taView.append("Emp Name\t"+"Phone No\t"+"Anual Salary\t"+"Monthly Salary\t"+"Increment Salary"+"\n");
       for(int x=0;x<arEmp.size();x++){
       taView.append(arEmp.get(x).toString()+"\n");
   
   
   }
   }
    
}
