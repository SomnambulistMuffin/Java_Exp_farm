package vut.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.*;
import vut.data.Athlete;
import vut.data.DuplicateException;
//import vut.data.DuplicationException;


/**
 *
 * @author 
 */
public class AddAthlete extends JFrame{
private JTextField txtAthleteID,txtName,txtAge;
private JRadioButton radMale,radFemale;
private JComboBox<String> cmbSports,cmbProvince;
private JButton btnAddAthlete,btnClear,btnClose;

private JLabel lblAthleteID,lblName,lblAge,lblGender,lblSport,lblProvince;
private  ArrayList<Athlete>arAthlete = new ArrayList<>();

public AddAthlete(ArrayList<Athlete>arAthlete){
    
this.arAthlete = arAthlete;

lblAthleteID= new JLabel("Athlete ID: ");
lblName= new JLabel("Name: ");
lblAge= new JLabel("Age: ");
lblSport= new JLabel("Sport: ");
lblProvince= new JLabel("Province: ");
lblGender = new JLabel("Gender: ");
    
txtAthleteID= new JTextField(25);
txtName= new JTextField(25);
txtAge= new JTextField(25);


Font myFont = new Font("SAN_SERIF",Font.ITALIC,16);
radFemale=new JRadioButton("Female");
radFemale.setFont(myFont);
radMale=new JRadioButton("Male");
radMale.setFont(myFont);

ButtonGroup grp = new ButtonGroup();
grp.add(radMale);
grp.add(radFemale);

cmbSports=new JComboBox();


cmbProvince=new JComboBox();


 btnAddAthlete=new JButton("Add Athlete");
 btnClear=new JButton("Clear");
 btnClose=new JButton("Close");
 
 
 
 //Panel
 JPanel pnlData = new JPanel();
 pnlData.setLayout(null);
 
 pnlData.add(lblAthleteID);
 pnlData.add(lblName);
 pnlData.add(lblAge);
 pnlData.add(lblGender);
 pnlData.add(lblSport);
 pnlData.add(lblProvince);
 
 pnlData.add(txtAthleteID);
 pnlData.add(txtName);
 pnlData.add(txtAge);

 
 pnlData.add(radFemale);
 pnlData.add(radMale);
 pnlData.add(cmbSports);
 pnlData.add(cmbProvince);
 
 pnlData.add(btnAddAthlete);
 pnlData.add(btnClear);
 pnlData.add(btnClose);
 
 //setbounds to label
 lblAthleteID.setBounds(10, 20, 100, 20);
 txtAthleteID.setBounds(100, 20, 180, 20);
 
 lblName.setBounds(10, 60, 100, 20);
 txtName.setBounds(100, 60, 180, 20);
 
 lblAge.setBounds(10, 100, 100, 20);
 txtAge.setBounds(100, 100, 180, 20);
 
 lblGender.setBounds(10, 140, 100, 20);
 radFemale.setBounds(100, 140, 80, 20);
 radMale.setBounds(190, 140, 180, 20);
 
 lblSport.setBounds(10, 180, 100, 20);
cmbSports.setBounds(100,180, 180, 20);

lblProvince.setBounds(10, 220, 100, 20);
    cmbProvince.setBounds(100, 220, 180, 20);
    
    btnAddAthlete.setBounds(10, 260, 100, 20);
    btnClear.setBounds(120, 260, 100, 20);
    btnClose.setBounds(240, 260, 100, 20);
    
    setContentPane(pnlData);
 
//invoking
   getSports();
   getProvinces();
   
   //invoke listeners
   btnAddAthlete.addActionListener(new BtnAddListener());
   btnClear.addActionListener(new BtnClearListener());
   btnClose.addActionListener(new BtnCloseListener());
}

   

private void getSports(){


    try {
        FileInputStream fInput = new FileInputStream("Sport.txt");
        DataInputStream inData = new DataInputStream(fInput);
        BufferedReader br = new BufferedReader(new InputStreamReader(inData));
        
        String rLine;
        
        while((rLine =br.readLine()) != null)
        {
            cmbSports.addItem(rLine);
            
        }
    } catch (IOException e)
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
   
} 

private  void getProvinces(){
    try {
        FileInputStream fInput = new FileInputStream("Province.txt");
        DataInputStream inData = new DataInputStream(fInput);
        BufferedReader br = new BufferedReader(new InputStreamReader(inData));
        
        String rLine;
        
        while((rLine =br.readLine()) != null)
        {
            cmbProvince.addItem(rLine);
            
        }
    } catch (IOException e)
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

private class BtnAddListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
       int athleteID,age;
        String name;
        Athlete.Gender gender;
        String  sport;
        String province;
        Athlete objAthletes= null;
        
            try {
                
                if (txtAge.getText().length() == 0 
                    || txtAthleteID.getText().length()==0
                     || txtName.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(null, "Please enter all data");
                }else
                
                {
                athleteID =Integer.parseInt(txtAthleteID.getText());
                age=Integer.parseInt(txtAge.getText());
                name=txtName.getText();
                sport = cmbSports.getSelectedItem().toString();
                province = cmbProvince.getSelectedItem().toString();
             
                if (radFemale.isSelected())
                {
                 gender=Athlete.Gender.FEMALE;
                }else
                {
                 gender=Athlete.Gender.MALE;
                }
                
                objAthletes = new Athlete(athleteID, age, name, gender, sport, province);
                objAthletes.addNewAthlete(objAthletes);
                
                JOptionPane.showMessageDialog(null, "Athlete added");
                } 
            } catch (DuplicateException e) 
            {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

private class BtnClearListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
      txtAthleteID.setText("");
      txtAthleteID.requestFocus();
      txtName.setText("");
      txtAge.setText("");
      radFemale.setSelected(false);
      radMale.setSelected(false);
      cmbSports.setSelectedItem(false);
      cmbProvince.setSelectedItem(false);
        }
    
}

private class BtnCloseListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
       dispose();
        }
    
}



}