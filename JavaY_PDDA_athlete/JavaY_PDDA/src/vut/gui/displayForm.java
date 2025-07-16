/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import vut.data.clsAthlete;

/**
 *
 * @author DeOxy
 */
public class displayForm extends JFrame{
        
    private JTextArea txtDisp = new JTextArea();
    private JPanel pnl = new JPanel();
    private static ArrayList<clsAthlete>arAthlete = new ArrayList<>();
    
    
    public displayForm(ArrayList<clsAthlete> arAthlete) {
    
        this.arAthlete = arAthlete;
        
        pnl.setLayout(new BorderLayout());
        
        
    }
    
}
