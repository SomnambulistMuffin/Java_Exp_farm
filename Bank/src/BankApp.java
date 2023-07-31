import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vut.BankAccount;
import java.util.ArrayList;

public class BankApp extends javax.swing.JFrame{
    private ArrayList<BankAccount> arListAcc = new ArrayList<>();
    private  BankAccount objBankAcc;

    private JPanel panel1;
    private JButton btnSave;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BankApp");
        frame.setContentPane(new BankApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField txtName;
    private JTextField txtBalance;
    private JList lstNames;
    private JTextField txtTransType;
    private JTextField txtWithdrawalAmt;
    private JButton btnTransaction;
    private JButton btnHighest;
    private JLabel lblSaveMsg;
    private JLabel lblTransactionMsg;

    public BankApp() {

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String name;
            double balance;

            try {
                name = txtName.getText();
                balance = Double.parseDouble(txtBalance.getText());

                objBankAcc = new BankAccount(name,balance);// raises possible illegal argument exception
                arListAcc.add(objBankAcc); // adding object to array list

                showAllBankAcc(); // display array on listbox

               // txtName.setText("");
              //  txtBalance.setText("");
               // txtName.requestFocus();
                lblSaveMsg.setText(name +"info saved");
                for(int i = 0; i < arListAcc.size();i++){
                    lstNames.setListData(arListAcc.get(i));
                }


               // for(int i =0; i<arListAcc.size();i++ ){
                //    objBankAcc = arListAcc.get(i);

                 //   lstNames.add();

               // }

            }catch (NumberFormatException numE){
                throw new NumberFormatException("invalid number entered" + numE.getMessage());
            }catch (IllegalArgumentException illE){
                throw new IllegalArgumentException("invalid info entered"+ illE.getMessage());
            }
            }

        });


        btnTransaction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int pos;
            String transtype;
            double withdrawalAmt ;

            pos = lstNames.getSelectedIndex();
            withdrawalAmt = Double.parseDouble(txtWithdrawalAmt.getText());
            transtype = txtTransType.getText();



                if ((pos >= 0)&& (pos< arListAcc.size())&& withdrawalAmt>= 50) {
                    objBankAcc = arListAcc.get(pos);

                    switch (transtype){
                        case "B" : transtype = "B";
                        case "W" : transtype = "W";
                    }
                    if (transtype.contentEquals("B")) {

                    lblTransactionMsg.setText(objBankAcc.toString());
                    }else if (transtype.contentEquals("W")){
                       objBankAcc.withdrawal(withdrawalAmt);
                        lblTransactionMsg.setText("your withdrawn amount is: " + String.format("%5.2f",withdrawalAmt) );
                    }
                }else {
                    JOptionPane.showMessageDialog(btnTransaction,"Error! please select a valid item on the list");
                }


            }
        });
        btnHighest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int highpos;

            highpos = 0;
                for (int i =0; i < arListAcc.size(); i++) {
                    if (arListAcc.get(i).getBalance() >arListAcc.get(highpos).getBalance()) {
                        highpos = i;
                    }
                    objBankAcc = arListAcc.get(highpos);
                    JOptionPane.showMessageDialog(btnHighest,objBankAcc.toString());
                }
            }
        });

    } public void showAllBankAcc(){
        String[] arNames = new String[arListAcc.size()]; // creating array that holds arraylist

        for (int i = 0; i < arNames.length; i++) {
            arNames[i] = arListAcc.get(i).getName();

        }
        lstNames.setListData(arNames);
        //lstNames.setEnabled(true);
    }

}

