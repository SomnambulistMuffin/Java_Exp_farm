package vut.data.GUI;

import java.util.ArrayList;
import javax.swing.*;
import vut.data.StudentClass;
/*
@author 215079698
 */
public class DisplayScreen extends JFrame{
    JTextArea taDisplay = new JTextArea();

    public DisplayScreen(ArrayList<StudentClass> arstud) {
        taDisplay.setEditable(false);

        JPanel pnl = new JPanel();
        pnl.setLayout(null);
        pnl.add(taDisplay);
        taDisplay.setBounds(0,0,400,300);
        setContentPane(pnl);
        displayAllstuds(arstud);
    }
    public void displayAllstuds(ArrayList<StudentClass> arstud){

        taDisplay.append("studNo \t"+"studName\t"+"Gender\t"+"sCode\t"+"marks" );

        for (int i = 0; i <arstud.size() ; i++) {
            taDisplay.append(arstud.get(i).toString());
        }
    }
}
