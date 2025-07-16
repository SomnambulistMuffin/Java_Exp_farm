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
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import vut.data.DataStorageException;
import vut.data.NotFoundException;
import vut.data.clsAthlete;

/**
 * remember to extend jframe
 *
 * @author DeOxy
 */
public class guiHome extends JFrame {

    //declerations
    //menu bar and items
    private JMenuItem miReg, miShowRec, miSearch, miUpdate, miExit, miDelete, miHighest, miLowest;//options
    private JMenu mFile, mInfo;//menu bar sections
    private JMenuBar mbBar;

    //DB Objecs
    private static ArrayList<clsAthlete> arAthlete = new ArrayList<>();
    private clsAthlete objAthlete;

    //create home screen menu
    public guiHome(ArrayList<clsAthlete> arAthlete) {

        this.arAthlete = arAthlete;

        //create menu objects
        miReg = new JMenuItem("Athlete Registration");
        miShowRec = new JMenuItem("Show Athlete Records");
        miSearch = new JMenuItem("Search Athlete Record by ID");
        miUpdate = new JMenuItem("Update Athlete Sport");
        miDelete = new JMenuItem("Delete Athlete Record");
        miExit = new JMenuItem("Exit");
        miHighest = new JMenuItem("Highest");
        miLowest = new JMenuItem("Lowest");

        //create file tab
        mFile = new JMenu("File");
        //populate file tab
        mFile.add(miSearch);
        mFile.add(miUpdate);
        mFile.add(miHighest);
        mFile.add(miLowest);

        //Info tab
        mFile = new JMenu("Information");
        //populate
        mFile.add(miReg);
        mFile.add(miShowRec);
        mFile.add(miExit);

        //create menu bar
        mbBar = new JMenuBar();
        mbBar.add(mFile);
        mbBar.add(mInfo);

        //add menu bar to jframe
        setJMenuBar(mbBar);

        //call init method
        try {
            clsAthlete.initilise();
        } catch (DataStorageException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }

    //create button listners
    private class miRegEvent implements ActionListener {

        //#NB Create Add Athlete class prior
        @Override
        public void actionPerformed(ActionEvent a) {
            add obj = new add(arAthlete);//add new athlete from array
            obj.setSize(500, 400);//frame size
            obj.setResizable(true);
            obj.setVisible(true);
        }

    }

    /**
     * show record click event
     */
    public class miShowRecEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            displayForm obj = new displayForm(arAthlete);
            obj.setSize(500, 400);//frame size
            obj.setResizable(true);
            obj.setVisible(true);

        }

    }
    
    public class miSearchEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent a) {
         int id;
         
         try{
             //get input from user
             id = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter ID: "));
             
             //create object to use athlete class
             clsAthlete objAthlete = null;
             objAthlete = clsAthlete.find(id);//strore what you found
             //diplay
             JOptionPane.showMessageDialog(null, objAthlete.toString());
             
         }catch (HeadlessException | NotFoundException e){
         }
        
        }
        
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}
