
package vut.gui;

import javax.swing.JFrame;

/**
 *
 * @author Joseph
 */
public class RunSalesPersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame screen = new SalesPersonMenu();
        screen.setTitle("Sales Person Main Menu");
        screen.setSize(300, 200);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        screen.setResizable(false);
    }
    
}
