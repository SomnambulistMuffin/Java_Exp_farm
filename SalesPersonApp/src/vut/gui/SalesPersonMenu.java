package vut.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import vut.data.DataStorageException;
import vut.data.SalesPerson;
import vut.gui.SalesPersonScreen;

/**
 *
 * @author 
 */
public class SalesPersonMenu extends JFrame {
    
    private JMenuItem mnuPersonData, mnuStats, mnuCompanyTurnOver;
    private JMenuItem mnuClose;
    private static ArrayList<SalesPerson> arSales;
    private static final File salesPersonFile = new File("salesperson.txt");
    
    public SalesPersonMenu() {
        mnuPersonData = new JMenuItem("Open Sales person Window");
        mnuStats = new JMenuItem("View Company statistics");
        mnuCompanyTurnOver = new JMenuItem("Get Company TurnOver");
       mnuClose = new JMenuItem("Close Window");
        
        JMenu mnuUser = new JMenu("File");
        mnuUser.add(mnuClose);
        mnuUser.addSeparator();
        
        JMenu mnuSales = new JMenu("Sales Person");
        mnuSales.add(mnuPersonData);
        
        JMenu mnuCompany = new JMenu("Company Transaction");
        mnuCompany.add(mnuCompanyTurnOver);
        mnuCompany.add(mnuStats);
        mnuCompany.addSeparator();
        
        JMenuBar mnuBar = new JMenuBar();
        mnuBar.add(mnuUser);
        mnuBar.add(mnuSales);
        mnuBar.add(mnuCompany);
        setJMenuBar(mnuBar);
        
        mnuPersonData.addActionListener(new AddListener());
        mnuClose.addActionListener(new CloseListener());
        mnuCompanyTurnOver.addActionListener(new CompanyTurnOverListener());
        mnuStats.addActionListener(new StatListener());
        
        addWindowListener(new WinListener());
        
    }
    
    private class AddListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            SalesPersonScreen screen = new SalesPersonScreen(arSales);
            screen.setTitle("Sales Person Screen");
            screen.setSize(500, 500);
            screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            screen.setVisible(true);
            screen.setResizable(false);
        }
        
    }
    
    private class CloseListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                SalesPerson.terminate();
            } catch (DataStorageException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());                
            }
            dispose();
            System.exit(0);
        }
        
    }
    
    private class CompanyTurnOverListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class StatListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class WinListener implements WindowListener {
        
        @Override
        public void windowOpened(WindowEvent we) {
            try {
                SalesPerson.initiliase();
            } catch (DataStorageException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        }
        
        @Override
        public void windowClosing(WindowEvent we) {
            
        }
        
        @Override
        public void windowClosed(WindowEvent we) {
            
        }
        
        @Override
        public void windowIconified(WindowEvent we) {
            
        }
        
        @Override
        public void windowDeiconified(WindowEvent we) {
            
        }
        
        @Override
        public void windowActivated(WindowEvent we) {
            
        }
        
        @Override
        public void windowDeactivated(WindowEvent we) {
            
        }
        
    }
    
}
