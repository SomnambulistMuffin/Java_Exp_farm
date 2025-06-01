package vut.data.GUI;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

import vut.data.StudentClass;
import javax.swing.JFrame;


public class MainMenuScreen extends JFrame {
    //declaring menu items
    JMenuItem miaddStudNo, miDisplay, miSearch, miCount, miHighest,miExit;

    //declaring menus
    JMenu mnFile,mnStud;

    //declare arraylist
    private ArrayList<StudentClass> arStud;

    public MainMenuScreen() {
        //array list object
        arStud = new ArrayList<>();

        //creating menu items objects
        miaddStudNo = new JMenuItem("add new Student Number");
        miDisplay = new JMenuItem("Display student info");
        miSearch = new JMenuItem("search student records by student number");
        miCount = new JMenuItem("count student records doing ASBDSY3A");
        miHighest = new JMenuItem("get student with highest mark");
        miExit = new JMenuItem("exit application");

        //create menu objects and add menu objects

        mnFile = new JMenu("File");
        // add menus in the menu bar
        mnFile.add(miSearch);
       mnFile.add(miHighest);
       mnFile.add(miCount);
       mnFile.add(miExit);

       mnStud = new JMenu("student");

       //add menus in the menu bar according to order of appearance
        mnStud.add(miaddStudNo);
        mnStud.add(miDisplay);

        //create menubar and add items in menubar
        JMenuBar jmb = new JMenuBar();

        //add items into menubar
        jmb.add(mnFile);
        jmb.add(mnStud);

        //calling setmenujbar to add menu and display them
        setJMenuBar(jmb);

        //registering menu item events
        miaddStudNo.addActionListener(new miAddStudentEvent());
        miDisplay.addActionListener(new miDisplayEvent());
        miHighest.addActionListener(new miHighestEvent());
        miCount.addActionListener(new miCountEvent());
        miSearch.addActionListener(new miSearchEvent());
        miExit.addActionListener(new miExitEvent());



    }
    //creating menu items using inner class for each item
    //inner class to trigger add student event

    private class miAddStudentEvent implements ActionListener   {
        @Override
        public void actionPerformed(ActionEvent e) {
            StudInfo frm = new StudInfo(arStud);
            frm.setVisible(true);
            frm.setTitle("Student screen by S.zwane");
            frm.setSize(400,300);
            frm.setResizable(false);

        }
    }// add item

    // inner class to create display item event
    public class miDisplayEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //calling display sceeen to open

            DisplayScreen frm = new DisplayScreen(arStud);
            frm.setVisible(true);
            frm.setTitle("display screen by s.zwane");
            frm.setSize(400,300);
            frm.setResizable(false);

        }


    }//display item

    //creating the search event inner class
    public class miSearchEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name;

            Scanner in = new Scanner(System.in);
            for (int i = 0; i < arStud.size(); i++) {
               ArrayList<StudentClass> result = arStud.stream().filter(name -> arStud.contains(name)  ).collect(Collectors.toList());
            }
            System.out.println(result);
            }
        }
    } //search records

    //creating the count event inner class
    public class miCountEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

                int iCnt = 0;
                String studName = null;

            for (int i = 0; i < arStud.size(); i++) {
                if (arStud.get(i).getStdNo().equals(studName)){
                    iCnt += i;
                }
            }


        }
    }// counting students in array

    public class miHighestEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        //arraylist containing student marks

            ArrayList<Integer> alMarks = new ArrayList<>();

            //adding elements to arraylist
            alMarks.add(88);
            alMarks.add(65);
            alMarks.add(58);
            alMarks.add(79);
            alMarks.add(94);
            alMarks.add(50);

            System.out.println(Collections.max(alMarks));

        }

            }//highest grade

    public class miExitEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int respond;

            respond = JOptionPane.showConfirmDialog(null,"do you want to exit?","confirm",JOptionPane.YES_NO_OPTION);
            if (respond==JOptionPane.YES_OPTION) {
                System.exit(0);

            }else{
                mnStud.requestFocus();
            }
        }
    }

    public static void main(String[] args) {
        MainMenuScreen frm=new MainMenuScreen();
        frm.setVisible(true);
        frm.setTitle("Main menu screen by S.zwane");
        frm.setSize(400,300);
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
