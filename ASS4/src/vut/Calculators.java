/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @authora SATHIKGE_214248038
 */
public class Calculators extends JFrame {

    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnPlus, btnAddSub, btnMultiply, btnDivide, btnSub, btnCancel, btnAnswer, btnDot, btnDelete;
    private JRadioButton rdrOn, rdrOff;
    private JTextField txtDisplay;

    public Calculators() {
        Font myFont = new Font("Arial", Font.BOLD, 18);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnAddSub = new JButton("+/-");
        btnPlus = new JButton("+");
        btnSub = new JButton("-");
        btnDivide = new JButton("/");
        btnMultiply = new JButton("x");
        btnCancel = new JButton("Reset");
        btnDot = new JButton(".");
        btnAnswer = new JButton("Ans");
        rdrOff = new JRadioButton("Off");
        rdrOff.setFont(myFont);
        rdrOn = new JRadioButton("On");
        rdrOn.setFont(myFont);
        btnDelete = new JButton("Delete");
        txtDisplay = new JTextField();

        JPanel pnlDisplay = new JPanel();
        pnlDisplay.setLayout(new BorderLayout());
        pnlDisplay.add(txtDisplay, BorderLayout.CENTER);

        JPanel pnlButtons = new JPanel();
        pnlButtons.setLayout(new GridLayout(5, 0));
        pnlButtons.setSize(300, 100);
        pnlButtons.add(rdrOff);
        pnlButtons.add(rdrOn);
        pnlButtons.add(btnCancel);
        pnlButtons.add(btnDelete);
        pnlButtons.add(btnAddSub);

        JPanel pnlButtonsNum = new JPanel();
        pnlButtonsNum.setLayout(new GridLayout(4, 3));

        pnlButtonsNum.add(btn1);
        pnlButtonsNum.add(btn2);
        pnlButtonsNum.add(btn3);
        pnlButtonsNum.add(btnPlus);

        pnlButtonsNum.add(btn4);
        pnlButtonsNum.add(btn5);
        pnlButtonsNum.add(btn6);
        pnlButtonsNum.add(btnDivide);

        pnlButtonsNum.add(btn7);
        pnlButtonsNum.add(btn8);
        pnlButtonsNum.add(btn9);
        pnlButtonsNum.add(btnSub);

        pnlButtonsNum.add(btnDot);
        pnlButtonsNum.add(btn0);
        pnlButtonsNum.add(btnAnswer);
        pnlButtonsNum.add(btnMultiply);

        Container screen = getContentPane();
        screen.setLayout(new GridLayout(3, 0));

        screen.add(pnlDisplay);
        screen.add(pnlButtons);
        screen.add(pnlButtonsNum);

        txtDisplay.setEditable(false);
        //txtDisplay.setHorizontalAlignment((int) RIGHT_ALIGNMENT);

        screen.setFont(myFont);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.MAGENTA);
        setTitle("Nthabiseng Sathikge");
        setResizable(false);

         //calling the Numbers listener to display when button is clicked
        btn1.addActionListener(new NumbersActionListeners());
        btn2.addActionListener(new NumbersActionListeners());
        btn3.addActionListener(new NumbersActionListeners());
        btn4.addActionListener(new NumbersActionListeners());
        btn5.addActionListener(new NumbersActionListeners());
        btn6.addActionListener(new NumbersActionListeners());
        btn7.addActionListener(new NumbersActionListeners());
        btn8.addActionListener(new NumbersActionListeners());
        btn9.addActionListener(new NumbersActionListeners());
        btn0.addActionListener(new NumbersActionListeners());
        btnAddSub.addActionListener(new NumbersActionListeners());
  
        //calling the operators listener to display when button is clicked
        btnPlus.addActionListener(new operatorsListeners());
        btnDivide.addActionListener(new operatorsListeners());
        btnMultiply.addActionListener(new operatorsListeners());
        btnSub.addActionListener(new operatorsListeners());

          //calling the answer listener to display when button is clicked
      btnAnswer.addActionListener(new answerListener());

       //calling the onOffListener to display when button is clicked
       rdrOff.addActionListener(new onOffListener());
        rdrOn.addActionListener(new onOffListener());

        //calling the resetListener to display when button is clicked
        btnCancel.addActionListener(new resetListener());
        btnDelete.addActionListener(new resetListener());

        rdrOff.setEnabled(true);
        rdrOn.setEnabled(false);
        rdrOn.setSelected(true);
        txtDisplay.setText("0");
        txtDisplay.requestFocus();
    }
  
    //declaring all the variables that will be used in the listener
    private double firstnumber = 0, secNumber = 0, answer = 0;
    private String operator = "None";
      
   //creating the NumbersActionListeners
    public class NumbersActionListeners implements java.awt.event.ActionListener {

        @Override
        public void actionPerformed(ActionEvent action) {
            if (action.getSource() == btn1) {
                txtDisplay.setText(txtDisplay.getText() + btn1.getText());
            } else if (action.getSource() == btn2) {
                txtDisplay.setText(txtDisplay.getText() + btn2.getText());
            } else if (action.getSource() == btn3) {
                txtDisplay.setText(txtDisplay.getText() + btn3.getText());
            } else if (action.getSource() == btn4) {
                txtDisplay.setText(txtDisplay.getText() + btn4.getText());
            } else if (action.getSource() == btn5) {
                txtDisplay.setText(txtDisplay.getText() + btn5.getText());
            } else if (action.getSource() == btn6) {
                txtDisplay.setText(txtDisplay.getText() + btn6.getText());
            } else if (action.getSource() == btn7) {
                txtDisplay.setText(txtDisplay.getText() + btn7.getText());
            } else if (action.getSource() == btn8) {
                txtDisplay.setText(txtDisplay.getText() + btn8.getText());
            } else if (action.getSource() == btn9) {
                txtDisplay.setText(txtDisplay.getText() + btn9.getText());
            } else if (action.getSource() == btn0) {
                txtDisplay.setText(txtDisplay.getText() + btn0.getText());
            } else if (action.getSource() == btn0) {
                txtDisplay.setText(txtDisplay.getText() + btn0.getText());
            } else if (action.getSource() == btnAddSub) {

                double value = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                value = value * (-1);
                txtDisplay.setText(String.valueOf(value));
            }
        }
    }
      //CREATING the operatorsListeners listener
    public class operatorsListeners implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent action) {
            if (action.getSource() == btnPlus) {
                operator = "+";
                firstnumber = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
            } else if (action.getSource() == btnMultiply) {
                operator = "*";
                firstnumber = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
            } else if (action.getSource() == btnSub) {
                operator = "-";
                firstnumber = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
            } else if (action.getSource() == btnDivide) {
                operator = "/";
                firstnumber = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
            }
        }
    }
    //CREATING the answerListener listener
   public class answerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent action) {
            String myAns;

            if (action.getSource() == btnAnswer) {
                secNumber = Double.parseDouble(txtDisplay.getText());
                if (operator == "+") {
                    answer = firstnumber + secNumber;
                    myAns = String.format("%.0f", answer);
                    txtDisplay.setText(myAns);
                } else if (operator == "-") {
                    answer = firstnumber - secNumber;
                    myAns = String.format("%.0f", answer);
                    txtDisplay.setText(myAns);
                } else if (operator == "*") {
                    answer = firstnumber * secNumber;
                    myAns = String.format("%.0f", answer);
                    txtDisplay.setText(myAns);
                } else if (operator == "/") {
                    answer = firstnumber / secNumber;
                    myAns = String.format("%.0f", answer);
                    txtDisplay.setText(myAns);
                } else if (operator == "None") {
                    answer = 0;
                    myAns = String.format("%.0f", answer);
                    txtDisplay.setText(String.valueOf(secNumber));
                }
            }
        }

    }
  //CREATING the onOffListener listener
    public class onOffListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == rdrOn) {
                rdrOff.setSelected(false);
                on();
            } else if (ae.getSource() == rdrOff) {
                rdrOn.setSelected(false);
                txtDisplay.setText("");
                off();
            }
        }
    }

    //CREATING the resetListener listener
    public class resetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == btnCancel) {
                txtDisplay.setEditable(true);
                txtDisplay.setText("");
                operator = "";
                firstnumber = 0;
                answer = 0;
                secNumber = 0;
                txtDisplay.setEditable(false);
                txtDisplay.requestFocus();
            } else if (ae.getSource() == btnDelete) {
                txtDisplay.setText(txtDisplay.getText().substring(0, txtDisplay.getText().length() - 1));
                txtDisplay.setText(String.valueOf(secNumber));
            }
        }

    }
   
    public void on() {
        rdrOn.setEnabled(false);
        rdrOff.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn0.setEnabled(true);
        btnAnswer.setEnabled(true);
        btnSub.setEnabled(true);
        btnDivide.setEnabled(true);
        btnPlus.setEnabled(true);
        btnAddSub.setEnabled(true);
        btnMultiply.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDot.setEnabled(true);
        btnDelete.setEnabled(true);
        txtDisplay.setEnabled(true);
    }

    public void off() {
        rdrOn.setEnabled(true);
        rdrOff.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn0.setEnabled(false);
        btnAnswer.setEnabled(false);
        btnSub.setEnabled(false);
        btnDivide.setEnabled(false);
        btnPlus.setEnabled(false);
        btnAddSub.setEnabled(false);
        btnMultiply.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDot.setEnabled(false);
        btnDelete.setEnabled(false);
        txtDisplay.setEnabled(false);
    }

}
