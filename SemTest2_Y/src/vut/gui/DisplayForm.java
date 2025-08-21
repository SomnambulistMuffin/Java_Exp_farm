
package vut.gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import vut.data.Athlete;
import vut.data.NotFoundException;

/**
 *
 * @author OPHNEY HENDRICK
 */
public class DisplayForm extends JFrame{

    private JTextArea txtDisplay = new JTextArea();
    private JPanel pln = new JPanel();
    private static ArrayList<Athlete>arAthlete = new ArrayList<>();
    
    public DisplayForm( ArrayList<Athlete>arAthlete)
    {
        this.arAthlete = arAthlete;
        
        pln.setLayout(new BorderLayout());
        pln.add(txtDisplay, BorderLayout.CENTER);
        pln.add(txtDisplay);
        txtDisplay.setEditable(false);
        
        setContentPane(pln);
        display(arAthlete);
    }
    
    private void display(ArrayList<Athlete>arAthlete)
    {
        txtDisplay.setText("------------------------------"
                + "------------------------------------\n");
        
        //txtDisplay.setText();
        String nSport = JOptionPane.showInputDialog(null,"Enter sport");
        
            
          if (nSport.isEmpty())
        {
           arAthlete =  Athlete.getAllAthlete();
        }else
        {
            arAthlete = Athlete.getAllAthlete(nSport);
        }
        
       
        
        for (int i = 0; i < arAthlete.size(); i++) {
         
            txtDisplay.append(arAthlete.get(i).toString());
        }
      }
    
   public static void main(String[] args) {
        DisplayForm sc = new DisplayForm(arAthlete);
        sc.setSize(500, 400);
        sc.setVisible(true);
        sc.setResizable(false);
    } 
}
