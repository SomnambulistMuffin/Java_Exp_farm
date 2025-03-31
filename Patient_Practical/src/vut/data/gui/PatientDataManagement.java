package vut.data.gui;
import java.sql.SQLException;
import  java.util.*;
import javax.swing.*;
import vut.data.*;

public class PatientDataManagement extends javax.swing.JFrame{

    //initializing combobox with values
    private void loadComboBox(){
        try {
            if (PatientDA.getIDNumbers().size()>0){
                for (int i = 0; i < PatientDA.getIDNumbers().size(); i++) {
                    cmbIDNumbers.additem(PatientDA.getIDNumbers().get( i ));
                }
            } else{
                JOptionPane.showMessageDialog( null,"no records found" );
            }

        }catch (NotFoundException ex){
            JOptionPane.showMessageDialog( null,ex.getMessage() );

        }

    }

    /**
     * creates new patient management  form
     */
    public PatientDataManagement() {
        initComponents();
        loadComboBox();
    }

    /**
     * generated code for being initialised in constructor
     *
     */

    private void initComponents(){

        cmbIdNumbers = new javax.swing.JComboBox<>(  );

    }

    //variable declarations
    private javax.swing.JButton btnDisplayTotals;
    private javax.swing.JButton btnUpdate;
    private
}
