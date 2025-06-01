package vut.data.GUI;

import javax.swing.JFrame;

import


public class MyTester extends JFrame{

    public static void main(String[] args) {
        StudInfo frm=new StudInfo();
        frm.setVisible(true);
        frm.setTitle("STUDENT SCREEN BY S.zwane");
        frm.setSize(400,300);
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);

        DisplayScreen frmdisp=new DisplayScreen();
        frmdisp.setVisible(true);
        frmdisp.setTitle("DISPLAY SCREEN BY S.zwane");
        frmdisp.setSize(400,300);
        frmdisp.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
