/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

/**
 *
 * @author sathikge_214248038
 */
public class Employee extends JFrame implements ActionListener {

    private JTextField name, annSalary;
    private JButton btnCalculate, btnClear, btnClose;

    public Employee() {
        name = new JTextField();
        annSalary = new JTextField();
        btnCalculate = new JButton("Calculate and Display");
        btnClear = new JButton("Clear");
        btnClose = new JButton("Close");

        Container scrn = getContentPane();
        setSize(400, 200);
        scrn.setLayout(new GridLayout(2, 0));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel txtPanel = new JPanel(new GridLayout(2, 2));
        txtPanel.add(new JLabel("Employee Name:"));
        txtPanel.add(name);
        txtPanel.add(new JLabel("Annual Salary:"));
        txtPanel.add(annSalary);

        JPanel panelButton = new JPanel(new FlowLayout());
        panelButton.add(btnCalculate);
        panelButton.add(btnClear);
        panelButton.add(btnClose);

        scrn.add(txtPanel);
        scrn.add(panelButton);

        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);
        btnClose.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String empName;
        double annSal, monSalary, incrMonSalary;
        final double incrPerc = 0.08;
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        if (ae.getSource() == btnCalculate) {
            if ("".equals(name.getName()) || "".equals(annSalary.getText())) {

                JOptionPane.showMessageDialog(rootPane, "Enter both name and annual salary");
                if (name.getText() == "") {
                    name.requestFocus();
                } else {
                    annSalary.requestFocus();
                }
            } else {
                empName =name.getText();
                annSal = Double.parseDouble(annSalary.getText());
                monSalary = annSal / 12;
                incrMonSalary = monSalary + (monSalary * incrPerc);

                JOptionPane.showMessageDialog(rootPane, "Employee name" + empName + "\nAnnual Salary" + nf.format(annSalary)
                        + ("\nMonthly salary" + nf.format(monSalary) + "\nincrMonSalary" + nf.format(incrMonSalary)
                        ));

            }

        } else if (ae.getSource() == btnClear) {
           name.setText("");
            annSalary.setText("");
            annSalary.requestFocus();

        } else if (ae.getSource() == btnClose) {
            System.exit(0);

        }
    }

}
