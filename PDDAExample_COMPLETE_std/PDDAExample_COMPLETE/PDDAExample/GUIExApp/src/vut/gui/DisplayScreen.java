/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.util.ArrayList;
import javax.swing.*;
import vut.data.Student;

/**
 *
 * @author admin
 */
public class DisplayScreen extends JFrame
{
  JTextArea taDisp=new JTextArea();
  //constructor
  public DisplayScreen(ArrayList<Student> arStud){
  taDisp.setEditable(false);
  JPanel pnl=new JPanel();
  //set panel layout
  pnl.setLayout(null);
  //add taDisp to panel
  pnl.add(taDisp);
  //set bound for textarea
  taDisp.setBounds(0, 0, 490, 290);
  //set content to show panel control
      setContentPane(pnl);
      //display all data from arraylist
      displayAddStud(arStud);
  }
  //method to display all data from arraylist
  public void displayAddStud(ArrayList<Student> arStud){
      String asubj=JOptionPane.showInputDialog("Enter scode:");
      if(asubj.isEmpty()){
      arStud=Student.getAllStudRec();
      }else{
      arStud=Student.getAllStudRec(asubj);
      }
      taDisp.append("No of Record Retrived: "+arStud.size()+"\n");
   taDisp.append("Name\t"+"Gender\t"+"SCode\t"+"Marks\n");
            for (int i = 0; i < arStud.size(); i++)
            {
             taDisp.append(arStud.get(i).toString()+"\n");
            }
  }
}
