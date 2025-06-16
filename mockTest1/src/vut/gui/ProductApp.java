package vut.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import vut.Question1.Product;
public class ProductApp {
    private JPanel panel1;
    private JTextField txtCode;
    private JTextField txtDescript;
    private JButton btnSave;
    private JList lstProducts;
    private JTextField txtQuantityReceived;
    private JButton btnSell;
    private JTextArea txtData;
    private JButton btnReceive;
    private JTextField txtQuantity;
    private JTextField txtUnitPtice;
    private JLabel lblMessage;

    ArrayList arrListProd = new ArrayList<>();
    Product objProd;


    public static void main(String[] args) {
        JFrame frame = new JFrame("ProductApp");
        frame.setContentPane(new ProductApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ProductApp() {
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String code, description;
            double price;
            int qty;

            try {
                code = txtCode.getText();
                description = txtDescript.getText();
                price = Double.parseDouble(txtUnitPtice.getText());
                qty = Integer.parseInt(txtQuantity.getText());

                objProd = new Product(description,code,price,qty);

                arrListProd.add(objProd);

                showAllProducts();

                txtCode.setText("");
                txtDescript.setText("");
                txtQuantity.setText("");
                lblMessage.setText("success!");
                txtCode.requestFocus();
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(btnSave,"invalid number entered" + ex.getMessage());
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(btnSave,"invalid number entered"+ ex.getMessage());
            }
            }
        });
        btnSell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int pos,numsold;

                pos = lstProducts.getSelectedIndex();

                if ((pos >= 0)&& (pos <= arrListProd.size())){



                    numsold = Integer.parseInt(txtQuantityReceived.getText());


                    txtData.setText("price: " +objProd.salesTransaction(numsold) +"\nquantity" + objProd.getQty());
                }else {
                    JOptionPane.showMessageDialog(btnSell,"select a product");
                }


            }
        });
        btnReceive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            int pos, receivedpos;


            pos = lstProducts.getSelectedIndex();

            try {


                if (( pos >= 0)&&(pos <= arrListProd.size())) {
                    receivedpos = Integer.parseInt(txtQuantityReceived.getText());


                    txtData.setText("price: " + objProd.getUnitPrice() + "\nQuantity: " + objProd.receiveGoods(receivedpos));
                }else{
                    JOptionPane.showMessageDialog(btnReceive,"error Select a product");
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(btnReceive,"error invalid number entered" + ex.getMessage());
            }catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(btnReceive,"error invalid number entered" + ex.getMessage());
            }

            }
        });

    }
    public void showAllProducts(){
        String[] arProd = new String[arrListProd.size()];

        for (int i = 0; i < arProd.length; i++) {

             arProd[i] = arrListProd.get(i).toString();

        }

        lstProducts.setListData(arProd);
        txtData.setText("");
    }
}
