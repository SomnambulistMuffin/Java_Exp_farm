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
import vut.data.DuplicateException;
import vut.data.Student;

/**
 *
 * @author admin
 */
public class StudScreen extends JFrame
{
    JLabel lblnm=new JLabel("StName");
    JLabel lblgender=new JLabel("Gender");
    JLabel lblcode=new JLabel("SCode");
    JLabel lblmarks=new JLabel("Marks");
    JTextField txtnm=new JTextField();
    JTextField txtmarks=new JTextField();
    JRadioButton rbmale =new JRadioButton("Male");
JRadioButton rbfemale =new JRadioButton("Female");
    JComboBox<String> cmb=new JComboBox<>();
    JButton btnAdd=new JButton("Add Stud");
    JButton btnclear=new JButton("Clear");
    JButton btnclose=new JButton("Close");
   // JTextArea taDisp=new JTextArea();
    
    private  ArrayList<Student> arStud; 
    //constructor 
    public StudScreen(ArrayList<Student> arStud){
        //arStud=new ArrayList<>();
        this.arStud=arStud;
        //POPULATE COMBOBOX WITH DATA
    cmb.addItem("ASBDY3A");
    cmb.addItem("ASDSY3A");
    cmb.addItem("ASPRO3E");
    cmb.addItem("AIWMX2A");
    //taDisp.setEditable(false);
    JPanel pnl =new JPanel();
    pnl.setLayout(null);
    //adding object/controls to panel
    pnl.add(lblnm); pnl.add(lblgender);
    pnl.add(lblcode);pnl.add(lblmarks);
    pnl.add(txtnm);pnl.add(txtmarks);
    pnl.add(cmb);pnl.add(btnAdd);
    pnl.add(btnclear);//pnl.add(taDisp);
    pnl.add(rbmale);pnl.add(rbfemale);
    pnl.add(btnclose);
    //setting control bounds
    lblnm.setBounds(10, 20, 140, 20);
    txtnm.setBounds(100, 20, 120, 20);
    lblgender.setBounds(10, 50, 140, 20);
    rbmale.setBounds(100, 50, 100, 20);
    rbfemale.setBounds(200, 50, 100, 20);
    lblcode.setBounds(10, 80, 140, 20);
    cmb.setBounds(100, 80, 120, 20);
    lblmarks.setBounds(10, 110, 140, 20);
    txtmarks.setBounds(100, 110, 120, 20);
    //setting bound for buttons
    btnAdd.setBounds(10, 150, 120, 20);
    btnclear.setBounds(150, 150, 120, 20);
    btnclose.setBounds(280, 150, 120, 20);
    //bounds for text area
    //taDisp.setBounds(10, 200, 400, 200);
    //show panel content
        setContentPane(pnl);
      //register buttons 
      btnAdd.addActionListener(new btnAddHandler());
      btnclear.addActionListener(new btnClearHandler());
      btnclose.addActionListener(new btnCloseHandler());
    }
    //inner classes for buttons
    private class btnAddHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try{
        
         Student objSt =getStud();
//calling PD method to add new record
objSt.addNewStud();
            }catch(DuplicateException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    
    }
    //inner class for clear button event
    private class btnClearHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
          txtnm.setText("");txtnm.requestFocus();
          txtmarks.setText("");
          rbmale.setSelected(false);
          rbfemale.setSelected(false);
          cmb.setSelectedIndex(0);
            
            
        }
    
    }
    //inner class for display button event
    private class btnCloseHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae)
        {
          
  dispose();
            
            
        }
    
    }
public Student getStud(){
    Student objSt=null;
 String nm,gender,scode;
         int marks;
         nm=txtnm.getText();
         marks=Integer.parseInt(txtmarks.getText());
         scode=cmb.getSelectedItem().toString();
         if(rbmale.isSelected()){
         gender=rbmale.getText();
         }else{
         gender=rbfemale.getText();
        }
         objSt =new Student(nm, gender, scode, marks);
         return objSt;
}
}
