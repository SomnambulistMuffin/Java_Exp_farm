package vut.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import vut.data.DuplicateException;
import vut.data.NotFoundException;

import vut.data.SalesPerson;

/**
 *
 * @author Joseph
 */
public class SalesPersonScreen extends JFrame {

    private SalesPerson objPerson;
    private JTextField txtID, txtName, txtAddress, txtCell, txtSale1,
            txtSale2, txtSale3, txtSale4;
    private JLabel lblID, lblName, lblAddress, lblCell, lblSale1,
            lblSale2, lblSale3, lblSale4, lblMsg;

    private JButton btnAddSalesPerson, btnDel, btnGetTotalSales,
            btnGetSalary, btnGetAnnualSalary, btnSearch;

    private ArrayList<SalesPerson> personList;
    private NumberFormat cur = NumberFormat.getCurrencyInstance();

    public SalesPersonScreen(ArrayList<SalesPerson> personList) {
        this.personList = personList;

        lblMsg = new JLabel("Please Enter All sales Person Details");

        lblMsg.setFont(new Font("SERIF", Font.BOLD, 20));
        lblAddress = new JLabel("Address: ");
        lblName = new JLabel("Name: ");
        lblID = new JLabel("SalesPerson ID: ");
        lblCell = new JLabel("Cellphone: ");
        lblSale1 = new JLabel("Sales Amount 1: ");
        lblSale2 = new JLabel("Sales Amount 2: ");
        lblSale3 = new JLabel("Sales Amount 3: ");
        lblSale4 = new JLabel("Sales Amount 4: ");

        txtID = new JTextField();
        txtName = new JTextField();
        txtAddress = new JTextField();
        txtCell = new JTextField();
        txtSale1 = new JTextField();
        txtSale2 = new JTextField();
        txtSale3 = new JTextField();
        txtSale4 = new JTextField();

        btnAddSalesPerson = new JButton("Add Sales person");
        btnDel = new JButton("Delete Sales person");
        btnGetSalary = new JButton("Get Salary");
        btnGetTotalSales = new JButton("Get Total sales");
        btnGetAnnualSalary = new JButton("get Annual salary");
        btnSearch = new JButton("Search Sales person");

        JPanel pnl = new JPanel();
        pnl.setLayout(null);
        pnl.add(lblMsg);
        pnl.add(lblID);
        pnl.add(lblName);
        pnl.add(lblAddress);
        pnl.add(lblCell);
        pnl.add(lblSale1);
        pnl.add(lblSale2);
        pnl.add(lblSale3);
        pnl.add(lblSale4);

        pnl.add(txtID);
        pnl.add(txtName);
        pnl.add(txtAddress);
        pnl.add(txtCell);
        pnl.add(txtSale1);
        pnl.add(txtSale2);
        pnl.add(txtSale3);
        pnl.add(txtSale4);

        pnl.add(btnAddSalesPerson);
        pnl.add(btnGetTotalSales);
        pnl.add(btnGetSalary);
        pnl.add(btnGetAnnualSalary);
        pnl.add(btnSearch);
        pnl.add(btnDel);

        lblMsg.setBounds(70, 0, 350, 20);
        lblID.setBounds(10, 30, 120, 30);
        lblName.setBounds(10, 70, 120, 30);
        lblAddress.setBounds(10, 110, 120, 30);
        lblCell.setBounds(10, 150, 120, 30);
        lblSale1.setBounds(10, 190, 120, 30);
        lblSale2.setBounds(10, 230, 120, 30);
        lblSale3.setBounds(10, 270, 120, 30);
        lblSale4.setBounds(10, 310, 120, 30);

        txtID.setBounds(140, 30, 180, 30);
        txtName.setBounds(140, 70, 180, 30);
        txtAddress.setBounds(140, 110, 180, 30);
        txtCell.setBounds(140, 150, 180, 30);
        txtSale1.setBounds(140, 190, 180, 30);
        txtSale2.setBounds(140, 230, 180, 30);
        txtSale3.setBounds(140, 270, 180, 30);
        txtSale4.setBounds(140, 310, 180, 30);

        btnAddSalesPerson.setBounds(10, 360, 160, 30);
        btnGetTotalSales.setBounds(170, 360, 160, 30);
        btnGetSalary.setBounds(330, 360, 160, 30);
        btnGetAnnualSalary.setBounds(10, 420, 160, 30);
        btnSearch.setBounds(170, 420, 160, 30);
        btnDel.setBounds(330, 420, 160, 30);

        setContentPane(pnl);
        btnAddSalesPerson.addActionListener(new SaveDataListener());
        btnGetTotalSales.addActionListener(new TotalSalesListener());
        btnGetSalary.addActionListener(new SalaryListener());
        btnGetAnnualSalary.addActionListener(new AnnualListener());
        btnDel.addActionListener(new DeleteListener());
        

    }

    private class SaveDataListener implements ActionListener {
 
        @Override
        public void actionPerformed(ActionEvent ae) {

            String salesPersonID, name;
            String cellPhone, address;
            double sales1, sales2, sales3, sales4;
            if (!txtID.getText().isEmpty() || !txtName.getText().isEmpty()
                    || !txtAddress.getText().isEmpty() || !txtCell.getText().isEmpty()
                    || !txtSale1.getText().isEmpty() || !txtSale2.getText().isEmpty()
                    || !txtSale3.getText().isEmpty() || !txtSale4.getText().isEmpty()) {
                salesPersonID = txtID.getText();
                name = txtName.getText();
                address = txtAddress.getText();
                cellPhone = txtCell.getText();
                sales1 = Double.parseDouble(txtSale1.getText());
                sales2 = Double.parseDouble(txtSale2.getText());
                sales3 = Double.parseDouble(txtSale3.getText());
                sales4 = Double.parseDouble(txtSale4.getText());

                try {
                    objPerson = new SalesPerson(salesPersonID, name, cellPhone, address, sales1, sales2, sales3, sales4);
                    objPerson.addSalesPerson();
                    JOptionPane.showMessageDialog(null, "Sales person added.\n "
                            + objPerson.getSalesPersonID());
                    clearAll();
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                } catch (DuplicateException ex) {
                    JOptionPane.showMessageDialog(null, "" + ex.getMessage());

                }
            }

        }

    }

    private class CloseListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }

    }

    private class TotalSalesListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Your total sales is: "
                    + cur.format(objPerson.getSalesTotal()));
        }

    }

    private class SalaryListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Your total sales is: "
                    + cur.format(objPerson.getSalesSalary()));
        }

    }
  

    private class AnnualListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Your total sales is: "
                    + cur.format(objPerson.getAnnualSal()));
        }

    }
    
      
    private void clearAll()
    {
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtCell.setText("");
        txtSale1.setText("");
        txtSale2.setText("");
        txtSale3.setText("");
        txtSale4.setText("");
        txtID.requestFocus();
    }
    

    private class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cell;
            try {
                cell = JOptionPane.showInputDialog("Enter cell number");

                objPerson.deleteSalesPerson(cell);
                JOptionPane.showMessageDialog(null, "Deleted.");
            } catch (NotFoundException e) {

            }
        }

    }

}
