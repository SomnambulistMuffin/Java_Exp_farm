package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;



import vut.Employee;

public class EmployeeTest extends javax.swing.JFrame{
    private JPanel panel1;
    private JTextField txtName;
    private JTextField txtPercent;
    private JTextField txtSalary;
    private JButton btnSave;
    private JButton btnDisplaySelected;
    private JButton btnIncreaseAll;
    private JButton btnIncreaseEmp;
    private JButton btnHighest;
    private JList lstdisplay;
    private JTextArea txtData;

    ArrayList<Employee> arrListEmp = new ArrayList<>();
    Employee objEmp;

    public EmployeeTest() {
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name;
                double salary;

                try {
                    name = txtName.getText();
                    salary = Double.parseDouble(txtSalary.getText());

                    objEmp = new Employee(name,salary);

                    arrListEmp.add(objEmp);

                    showAllEmployees();

                    txtName.setText("");
                    txtSalary.setText("");
                    txtName.requestFocus();


                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(btnSave,"\nError invalid number " + ex.getMessage());
                } catch (IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(btnSave,"\nError invalid name and salary entered: " + ex.getMessage());
                }
            }
        });
        btnDisplaySelected.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            int pos;

            pos = lstdisplay.getSelectedIndex();

                if ((pos >= 0)&& (pos <= arrListEmp.size())) {
                    objEmp = arrListEmp.get(pos);

                    txtData.setText("name: " + objEmp.getName() +
                            "\nSalary: " + String.format("5.2f",objEmp.getSalary()) );

                }else{
                    JOptionPane.showMessageDialog(btnDisplaySelected, "Error please select an employee");
                }
            }
        });
        btnHighest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            int highestPos;

            highestPos = 0;
                for (int i = 0; i < arrListEmp.size(); i++) {
                    if (arrListEmp.get(i).getSalary() > arrListEmp.get(highestPos).getSalary()){
                        highestPos = i;
                    }


                }
                objEmp = arrListEmp.get(highestPos);
                txtData.setText("name: " + objEmp.getName() + "\nSalary " + String.format("5.2f",objEmp.getSalary()) );
            }

        });
        btnIncreaseEmp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            int pos;
            double percent;

            try {
                pos = lstdisplay.getSelectedIndex();

                if ((pos >= 0)&&(pos <= arrListEmp.size())){

                    objEmp = arrListEmp.get(pos);

                    percent = Double.parseDouble(JOptionPane.showInputDialog("enter percentage"));
                    objEmp.increaseSalary(percent);

                    JOptionPane.showMessageDialog(btnIncreaseEmp,"employee: " + objEmp.getName() +
                            "\nSalary: " + objEmp.getSalary());


                }else {
                    JOptionPane.showMessageDialog(btnIncreaseEmp,"select valid employee on list");

                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(btnIncreaseEmp,"invalid Number entered" + ex.getMessage());
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(btnIncreaseEmp,"invalid employee info entered" + ex.getMessage());
            }
            }
        });
        btnIncreaseAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            double percent;

            try {
                percent = Double.parseDouble(JOptionPane.showInputDialog("enter percentage value"));

                for (int i = 0; i < arrListEmp.size() ; i++) {
                   objEmp = arrListEmp.get(i);

                   objEmp.increaseSalary(i);

                }
                JOptionPane.showMessageDialog(btnIncreaseAll,"all salaries increased");
                txtData.setText("");
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(btnIncreaseAll,"Invalid salary value entered" + ex.getMessage());
            } catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(btnIncreaseAll,"Invalid employee name value entered" + ex.getMessage());
            }
            }
        });
    }
    public void showAllEmployees(){
        String[] arNames = new String[arrListEmp.size()];

        for (int i = 0; i < arNames.length; i++) {
            arNames[i] = arrListEmp.get(i).getName();

        }

        lstdisplay.setListData(arNames);
        txtData.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EmployeeTest");
        frame.setContentPane(new EmployeeTest().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
