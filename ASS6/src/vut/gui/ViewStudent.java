package vut.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import vut.data.Student;

/**
 *
 * @author SATHIKGE
 */
public class ViewStudent extends JFrame {
    
    private ArrayList<Student> arStudent;
    private JTextArea txtView;
    
    public ViewStudent(ArrayList<Student> arStudents) {
        arStudent = new ArrayList<>();
        txtView = new JTextArea();
        txtView.setSize(new Dimension(900, 200));
        txtView.setVisible(true);
       
        txtView.setFont(new Font("SANS_SERIF", Font.BOLD, 14));
        
        JPanel pnl = new JPanel();
        pnl.setLayout(null);
        pnl.add(txtView);
        setContentPane(pnl);
        String data="Student No\tName\tGender\tSubject Code\tTest1\tTest2\tTest3\tYear Mark\tFinalMark"
                    + "\n" ;
        for (Student objStud : arStudents) {
            data=data+objStud.getStudentNo() + "\t   " + objStud.getName() + "\t   "
                    + objStud.getGender() + "\t   " + objStud.getSubjectCode() + "\t   "
                    + objStud.getTest1() + "\t   " + objStud.getTest2() + "\t   "
                    + objStud.getTest3() + "\t  " + objStud.calcSemesterMark()
                    + "\t   " + objStud.calcFinalMark(70);
        }
        txtView.setText(data);
    }
    
}
