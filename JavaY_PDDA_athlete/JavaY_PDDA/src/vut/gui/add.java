/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import vut.data.clsAthlete;

/**
 *
 * @author DeOxy
 */
public class add extends JFrame{

    //declare frame components 
    private JTextField txtID,txtName,txtAge;
    private JRadioButton radM,radF;
    private JButton btnAdd, btnClear, btnClose;
    
    //lable for each coresponding component
    private JLabel lblID, lblName, lblAge, lblGender, lblSport, lblProvince;
    private ArrayList<clsAthlete> arAthlete = new ArrayList<>();
    
    
    
    public add(ArrayList<clsAthlete> arAthlete) {
        
        this.arAthlete = arAthlete;
        
        //set lable text
        lblID = new JLabel("Athlete ID:");
        lblName = new JLabel("Name:");
        lblName = new JLabel("Name:");
        lblSport = new JLabel("Sport:");
        lblProvince = new JLabel("Proince:");
        lblGender = new JLabel("Gender:");
        
        txtID = new JTextField(25);
        
        
        
    }
    
}
