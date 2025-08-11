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
import javax.swing.JMenuItem;
import vut.data.Student;

/**
 *
 * @author Nthabi
 */
public class MainMenu extends JFrame
{

    private static JMenuItem mnAddStudent, mnViewStudent, mnSearchStudent, mnExit, mnGetHighestMark;
    public static ArrayList<Student> arStudn= new ArrayList<Student>();

    public MainMenu(ArrayList<Student> arStudents)
    {
        this.arStudn = arStudents;
        this.mnAddStudent = new JMenuItem("Add student");
        this.mnViewStudent = new JMenuItem("View Student");
        this.mnSearchStudent = new JMenuItem("Search Student");
        this.mnExit = new JMenuItem("Exit ");
        this.mnGetHighestMark = new JMenuItem("Get the highest mark");

        //CREATING MENUS
        JMenu mnFile = new JMenu("File");
        JMenu mnInfo = new JMenu("Info");

        //ADD ITEMS TO MENUS
        mnInfo.add(mnAddStudent);
        mnInfo.add(mnViewStudent);
        mnFile.add(mnSearchStudent);
        mnFile.add(mnGetHighestMark);
        mnFile.add(mnExit);

        //CREATE MENU BAR
        JMenuBar jmBar = new JMenuBar();

        //ADD ITEMS TO MENU BAR
        jmBar.add(mnFile);
        jmBar.add(mnInfo);

        //SET MENU BAR
        setJMenuBar(jmBar);

        //ACTION LISTENERS
        mnAddStudent.addActionListener(new mnAddStudent());
        mnViewStudent.addActionListener(new mnViewStudent());
        mnGetHighestMark.addActionListener(new MnHighestListener());
        mnSearchStudent.addActionListener(new MnHighestListener());

    }

    public static void main(String[] args)
    {

        MainMenu scrnMenu = new MainMenu(arStudn);
        scrnMenu.setSize(500, 500);
        scrnMenu.setTitle("Add Student Menu");
        scrnMenu.setResizable(false);
        scrnMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scrnMenu.setVisible(true);
    }

    public class mnAddStudent implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {

            AddStudent scrnAdd = new AddStudent();
            scrnAdd.setSize(500, 500);
            scrnAdd.setTitle("Add New Student");
            scrnAdd.setResizable(false);
            scrnAdd.setVisible(true);
        }

    }

    private class MnSearchListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            int found = -1;
            int studNo = 0;
            studNo = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "please enter the Student Number", ""));
            for (int i = 0; i < arStudn.size(); i++)
            {
                if (arStudn.get(i).getStudentNo() == studNo)
                {
                    found = i;
                }

            }
            if (found > -1)
            {
                JOptionPane.showMessageDialog(rootPane, arStudn.get(found).toString());
            }
        }
    }

    private class MnHighestListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            double highest = 0;
            String name = "", display = "";
            int index = 0;
            for (int i = 0; i < arStudn.size(); i++)

            {

                if (arStudn.get(i).calcSemesterMark() > highest)
                {
                    index = i;
                }
            }
            display = "name: " + arStudn.get(index).getName() + "\n"
                    + "student Number: " + arStudn.get(index).getStudentNo() + "\n"
                    + "test1:" + arStudn.get(index).getTest1() + "\n"
                    + "test2:" + arStudn.get(index).getTest2() + "\n"
                    + "test3: " + arStudn.get(index).getTest3() + "\n";
            JOptionPane.showMessageDialog(rootPane, display);

        }

    }

    public class mnViewStudent implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {

            ViewStudent scrnView = new ViewStudent(arStudn);
            scrnView.setSize(500, 500);
            scrnView.setTitle("View Student");
            scrnView.setResizable(false);
            scrnView.setVisible(true);
        }

    }
}
