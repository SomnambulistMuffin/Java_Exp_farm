package vut.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import vut.data.Student;

/**
 *
 * @author SATHIKGE_214248038
 */
public class AddStudent extends JFrame
{

   
    private JTextField txtStudNo, txtName, txtTest1, txtTest2, txtTest3;
    private JComboBox<String> cmbSubj;
    private JRadioButton radMale, radFemale;
    private JButton btnProcess, btnClear, btnExit;
    private JTextArea txtDisplay;
     private JTextField cmbSearch;
    private JLabel lblStudNo, lblStudName, lblTest1, lblTest2, lblTest3, lblSubject, lblGender;
  //  private ArrayList<Student> arStudents;
  //  private JLabel lblSelect;
    private int examMark;

    public AddStudent()
    {
       // arStudents = new ArrayList<>();
        cmbSearch = new JTextField();
        

        lblStudNo = new JLabel("Stud No: ");
        lblStudName = new JLabel("Name: ");
        lblGender = new JLabel("Gender: ");
        lblSubject = new JLabel("Subject Code: ");
        lblTest1 = new JLabel("Test 1: ");
        lblTest2 = new JLabel("Test 2: ");
        lblTest3 = new JLabel("Test 3: ");
      //  lblSelect = new JLabel("Select Student number: ");
        txtStudNo = new JTextField(25);
        txtName = new JTextField(25);
        txtTest1 = new JTextField(25);
        txtTest2 = new JTextField(25);
        txtTest3 = new JTextField(25);
        cmbSubj = new JComboBox();
        cmbSubj.addItem("ASBDY3");
        cmbSubj.addItem("ASBDX3");
        cmbSubj.addItem("ASBD2A");
        cmbSubj.addItem("AIIBA2");
        cmbSubj.addItem("AIIBA3");
        cmbSubj.addItem("EIXY2C");

        radFemale = new JRadioButton("Female");
        radMale = new JRadioButton("Male");

        ButtonGroup btnGrp = new ButtonGroup();
        btnGrp.add(radFemale);
        btnGrp.add(radMale);

        btnProcess = new JButton("Process");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");

        txtDisplay = new JTextArea();
        //  txtDisplay.setSize(new Dimension(200, 100));
        txtDisplay.setVisible(true);
        txtDisplay.setEditable(false);
        txtDisplay.setFont(new Font("SANS_SERIF", Font.BOLD, 14));

        JPanel pnlData = new JPanel();
        pnlData.setLayout(null);
        pnlData.add(lblStudNo);
       // pnlData.add(lblSelect);
        pnlData.add(lblStudName);
        pnlData.add(lblGender);
        pnlData.add(lblSubject);
        pnlData.add(lblTest1);
        pnlData.add(lblTest2);
        pnlData.add(lblTest3);

        pnlData.add(txtStudNo);
        pnlData.add(cmbSearch);
        pnlData.add(txtName);
        pnlData.add(radMale);
        pnlData.add(radFemale);
        pnlData.add(cmbSubj);
        pnlData.add(txtTest1);
        pnlData.add(txtTest2);
        pnlData.add(txtTest3);
        pnlData.add(btnProcess);
        pnlData.add(btnClear);
        pnlData.add(btnExit);
        pnlData.add(txtDisplay);

        //set labels bounds
        lblStudNo.setBounds(10, 20, 100, 20);
       // lblSelect.setBounds(350, 20, 150, 20);
        lblStudName.setBounds(10, 55, 100, 20);
        lblGender.setBounds(10, 90, 100, 20);
        lblSubject.setBounds(10, 125, 100, 20);
        lblTest1.setBounds(10, 160, 100, 20);
        lblTest2.setBounds(10, 195, 100, 20);
        lblTest3.setBounds(10, 230, 100, 20);

        //data bounds
        txtStudNo.setBounds(100, 20, 100, 20);
        cmbSearch.setBounds(510, 20, 100, 20);
        txtName.setBounds(100, 55, 100, 20);
        radMale.setBounds(100, 90, 100, 20);
        radFemale.setBounds(220, 90, 100, 20);
        cmbSubj.setBounds(100, 125, 100, 20);
        txtTest1.setBounds(100, 160, 100, 20);
        txtTest2.setBounds(100, 195, 100, 20);
        txtTest3.setBounds(100, 230, 100, 20);
        btnProcess.setBounds(10, 255, 100, 20);
        btnClear.setBounds(130, 255, 100, 20);
        btnExit.setBounds(250, 255, 100, 20);
        txtDisplay.setBounds(10, 300, 950, 100);

        setContentPane(pnlData);
        btnProcess.addActionListener(new BtnProcessListener());
        btnClear.addActionListener(new BtnClearListener());
        btnExit.addActionListener(new BtnExitListener());
       // cmbSearch.addActionListener(new CmbSearchListener());
    }

    public void loadCombo()
    {
        String studentNo;


    }

//    private class CmbSearchListener implements ActionListener
//    {
//
//        @Override
//        public void actionPerformed(ActionEvent ae)
//        {
//            txtDisplay.setText("");
//            int studNo;
//            studNo = Integer.parseInt(txtStudNo.getText());
//            if (studNo != 0)
//            {
//                for (int x = 0; x < arStudents.size(); x++)
//                {
//                    if (arStudents.get(x).getStudentNo() == studNo)
//                    {
//                        txtDisplay.append("Student no: " + arStudents.get(x).getStudentNo()
//                                + "\n" + "semester mark: " + arStudents.get(x).calcSemesterMark()
//                                + "\n" + "final mark: " + arStudents.get(x).calcFinalMark(examMark));
//                    }
//                }
//            }
//        }
//
//    }

    private class BtnProcessListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            try
            {
             
            String studNo = "", name = "";
            Student.Gender gender;
            String subjectCode = "";
            int test1 = 0, test2 = 0, test3 = 0;
            int finalMark;

            if (radFemale.isSelected())
            {
                gender = Student.Gender.FEMALE;

            }
            else
            {
                gender = Student.Gender.MALE;
            }
            name=txtName.getText();
            studNo=txtStudNo.getText();
           subjectCode =  cmbSubj.getSelectedItem().toString();
            
            test1=Integer.parseInt(txtTest1.getText());
            test2=Integer.parseInt(txtTest2.getText());
            test3=Integer.parseInt(txtTest2.getText());

            Student objStud = new Student(test3, name, test1, test2, test3, subjectCode, gender);

            int semMark = objStud.calcSemesterMark();

            if (semMark >= 50)
            {
                examMark = Integer.parseInt(JOptionPane.showInputDialog("Enter exam mark"));
                finalMark = objStud.calcFinalMark(examMark);
                txtDisplay.setText(objStud.toString());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You did not make it");
            }


            MainMenu.arStudn.add(objStud);

                   
            if (semMark >= 50)
            {
                examMark = Integer.parseInt(JOptionPane.showInputDialog("Enter examMark"));
                finalMark = objStud.calcFinalMark(examMark);
            }
            else
            {
                finalMark = semMark;
                JOptionPane.showMessageDialog(null, "You do not qualified");

                JOptionPane.showMessageDialog(null, "This student has been added. " + objStud.getStudentNo());
                txtDisplay.setText("Student No\tName\tGender\tSubject Code\tTest1\tTest2\tTest3\tYear Mark\tFinal Mark"
                        + "\n" + objStud.getStudentNo() + "\t   " + objStud.getName() + "\t   "
                        + objStud.getGender() + "\t   " + objStud.getSubjectCode() + "\t   "
                        + objStud.getTest1() + "\t   " + objStud.getTest2() + "\t   "
                        + objStud.getTest3() + "\t  " + semMark
                        + "\t   " + finalMark + "\t    " + "\n" + "-------------------------------------------------------------------"
                        + "-------------------------------------------------------------------------------------------------------"
                        + "--------------------------------------------"
                        + "\n");
            }   
            }
            catch (IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
            } 
        }
    }

    private class BtnClearListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {

        }

    }

    private class BtnExitListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            dispose();
        }

    }
}
