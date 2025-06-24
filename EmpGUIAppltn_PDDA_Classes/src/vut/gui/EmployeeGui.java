/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import vut.data.DuplicateException;
import vut.data.EmployeeClass;
/**
 *
 * @author Thaby
 */
public class EmployeeGui extends JFrame {
JTextField txtNm=new JTextField(20);
JTextField txtSal=new JTextField(20);
JTextField txtPhone=new JTextField(20);
    JComboBox<String> cmb=new JComboBox<>();
    JRadioButton rbMale=new JRadioButton("Male");
    JRadioButton rbFemale=new JRadioButton("Female");
JLabel lblName=new JLabel("Emp Name:");
JLabel lblSal=new JLabel("Annual Salary:");
JLabel lblPerc=new JLabel("Increase %:");
JLabel lblGender=new JLabel("Gender:");
JLabel lblPhone=new JLabel("Phone No:");
JButton btnAdd=new JButton("Add Emp");
JButton btnClear=new JButton("Clear");
JButton btnExit=new JButton("Exit");
//JTextArea tArea=new JTextArea();


private ArrayList<EmployeeClass> arEmp;
    public EmployeeGui(ArrayList<EmployeeClass> arEmp){
   this.arEmp=arEmp;
   
    cmb.addItem("7");
    cmb.addItem("8");
    cmb.addItem("9");
    cmb.addItem("10");
     JPanel pnl=new JPanel();
    pnl.setLayout(null);
    pnl.add(txtNm);
    pnl.add(txtSal);
    pnl.add(txtPhone);
    pnl.add(cmb);
    pnl.add(rbMale);
    pnl.add(rbFemale);
     pnl.add(lblName);
     pnl.add(lblSal);
     pnl.add(lblPerc);
     pnl.add(lblGender);
     pnl.add(lblPhone);
     pnl.add(btnAdd); pnl.add(btnClear); pnl.add(btnExit);
    //pnl.add(tArea);
     //setting control bounds for labels
     lblName.setBounds(10, 20, 140, 20);
     lblGender.setBounds(10, 50, 140, 20);
     lblPhone.setBounds(10, 80, 140, 20);
     lblSal.setBounds(10, 110, 140, 20);
     lblPerc.setBounds(10, 140, 140, 20);
     //input bounds
     txtNm.setBounds(100, 20, 120, 20);
     //radiobuttons in same line
     rbMale.setBounds(100, 50, 100, 20);
     rbFemale.setBounds(210, 50, 100, 20);
       txtPhone.setBounds(100, 80, 120, 20);
     txtSal.setBounds(100, 110, 120, 20);
     cmb.setBounds(100, 140, 100, 20);
    
     
     
     //button bound
     btnAdd.setBounds(20, 180, 120, 20);
     btnClear.setBounds(180, 180, 120, 20);
     btnExit.setBounds(90, 210, 120, 20);
     
     //text area bound for output
//     tArea.setBounds(10, 230, 300, 250);
//     tArea.setEditable(false);
        setContentPane(pnl);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //handling listeners
     btnAdd.addActionListener(new btnAddHandler());
     btnClear.addActionListener(new btnClearHandler());
     btnExit.addActionListener(new btnExitHandler());
          
    }
    
//    public static void main(String[] args) {
//    EmployeeGui frm=    new EmployeeGui();
//    frm.setTitle("EMPLOYEE FORM");
//    frm.setSize(400, 600);
//    
//    frm.setResizable(false);
//    frm.setVisible(true);
//    
//    }
private class btnAddHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
try{
EmployeeClass objEmp=getEmployee();
objEmp.addNewEmp();
}catch(DuplicateException ex){
JOptionPane.showMessageDialog(null, ex.getMessage());
}
       
     
        
   
        
       
    }
}//add
private class btnClearHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            txtNm.setText("");
            txtNm.requestFocus();
            txtSal.setText("");
         txtPhone.setText("");
            cmb.setSelectedIndex(0);
            rbFemale.setSelected(false);
            rbMale.setSelected(false);
        
        }


}
private class btnExitHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {

        dispose();
        }

}
public EmployeeClass getEmployee(){
EmployeeClass objEmp=null;
double salary, percIncr; 
       salary=Double.parseDouble(txtSal.getText());
       String percStr=cmb.getSelectedItem().toString();
       String name,gender,phone;
       name=txtNm.getText();
       phone=txtPhone.getText();
       percIncr=Double.parseDouble(percStr);
       if(rbMale.isSelected()){
       gender=rbMale.getText();
       }else
       {
       gender=rbFemale.getText();
               
       }
objEmp=new EmployeeClass(name, gender,phone, salary,percIncr);
return objEmp;
}
    
}
