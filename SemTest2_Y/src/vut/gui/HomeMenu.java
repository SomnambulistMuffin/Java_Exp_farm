/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import vut.data.Athlete;
import vut.data.DataStorageException;
import vut.data.NotFoundException;

/**
 *
 * @author OPHNEY HENDRICK
 */
public class HomeMenu extends JFrame {

    private JMenuItem miRegster, miShowRec, miSearch, miUpdate, miExit, miDelete, miHighest, miLowest;
    private JMenu mFile, mInfor;
    private JMenuBar jmBar;

    private static ArrayList<Athlete> arAthlete = new ArrayList<>();
    private Athlete objAthlete;

    public HomeMenu(ArrayList<Athlete> arAthlete) {

        this.arAthlete = arAthlete;

        miRegster = new JMenuItem("Athlete Registration");
        miShowRec = new JMenuItem("Show Athlete Records");
        miSearch = new JMenuItem("Search Athlete Record By ID");
        miUpdate = new JMenuItem("Update Athlete Sport");
        miExit = new JMenuItem("Exit");
        miDelete = new JMenuItem("Delete Athlete Records");
        miHighest = new JMenuItem("Highest");
        miLowest = new JMenuItem("Lowest");

        mFile = new JMenu("File");
        mFile.add(miSearch);
        mFile.add(miUpdate);
        mFile.add(miDelete);
        mFile.add(miHighest);
        mFile.add(miLowest);

        mInfor = new JMenu("Information");
        mInfor.add(miRegster);
        mInfor.add(miShowRec);
        mInfor.add(miExit);

        jmBar = new JMenuBar();
        jmBar.add(mFile);
        jmBar.add(mInfor);

        setJMenuBar(jmBar);

        miRegster.addActionListener(new MiRegisterEvent());
        miShowRec.addActionListener(new MiShowRecEvent());
        miSearch.addActionListener(new MiSearchEvent());
        miUpdate.addActionListener(new MiUpdateEvent());
        miDelete.addActionListener(new MiDeleteEvent());
        miLowest.addActionListener(new MiLowestEvent());
        miHighest.addActionListener(new MihighestEvent());
        miExit.addActionListener(new MiExitEvent());

        // call initialise method here
        try {
            Athlete.initialise();
        } catch (DataStorageException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private class MiRegisterEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            AddAthlete m = new AddAthlete(arAthlete);
            m.setSize(500, 400);
            m.setResizable(false);
            m.setVisible(true);
        }

    }

    private class MiShowRecEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            DisplayForm m = new DisplayForm(arAthlete);
            m.setSize(700, 500);
            m.setResizable(false);
            m.setVisible(true);

        }

    }

    private class MiSearchEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int id;

            try {
                id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID"));

                Athlete objeAth = null;
                objeAth = Athlete.findAthlete(id);

                JOptionPane.showMessageDialog(null, objeAth.toString());

            } catch (HeadlessException | NotFoundException e) {
            }

        }

    }

    private class MiUpdateEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Search for ID"));
                Athlete objAth = null;

                objAth = Athlete.findAthlete(id);

                String newSport = JOptionPane.showInputDialog(null, "Update sport: ");
                objAth.updateSport(newSport);

                JOptionPane.showMessageDialog(null, "Sport updated! ");
            } catch (HeadlessException | NotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }

    }

    private class MiDeleteEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
                
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID to delete"));
            try {
                objAthlete.deleteAthlete(id);
                JOptionPane.showMessageDialog(null, " Record deleted");
            } catch (HeadlessException | NotFoundException e) {
            }
        }

    }

    private class MihighestEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)
        {
               int high_age = -999999;
               
               for (int i = 0; i < arAthlete.size(); i++) {
               
                   if (arAthlete.get(i).getAge() > high_age)
                   {
                      // high_age = arAthlete.get(i).getAge();
                    JOptionPane.showMessageDialog(null, "Highest age: " +  arAthlete.get(i).toString()); 
                   }
                
            }
              
        }

    }

    private class MiLowestEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)
        {

        }

    }

    private class MiExitEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int msg;
            msg = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to exit", JOptionPane.YES_NO_OPTION);
            if (msg == JOptionPane.YES_OPTION) {
                try {
                    Athlete.terminate();
                    System.exit(0);
                } catch (DataStorageException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                mInfor.setRequestFocusEnabled(true);
            }
        }

    }

    public static void main(String[] args) {
        HomeMenu m = new HomeMenu(arAthlete);

        m.setSize(500, 400);
        m.setVisible(true);
        m.setResizable(false);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
