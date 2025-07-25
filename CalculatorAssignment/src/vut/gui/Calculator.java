/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author SPIRITMAN
 */
public class Calculator extends JFrame {

    private JButton btnAdd, btnSubtract, btnDivide, btnMultiply, btnEquals, btnDot;
    private JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    private JTextField txtDisplay;
    private JPanel pnlDisplay, numpad;
  private double display;
private double TEMP;
 private double SolveTEMP;
 private int operator;
 
    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("Calculator");
        setVisible(true);
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnEquals = new JButton("=");
        btnDot = new JButton(".");

        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");

        txtDisplay = new JTextField(12);
        numpad = new JPanel();
        pnlDisplay = new JPanel();

        numpad.add(btnOne);
        numpad.add(btnTwo);
        numpad.add(btnThree);
        numpad.add(btnAdd);
        numpad.add(btnFour);
        numpad.add(btnFive);
        numpad.add(btnSix);
        numpad.add(btnSubtract);
        numpad.add(btnSeven);
        numpad.add(btnEight);
        numpad.add(btnNine);
        numpad.add(btnMultiply);
        numpad.add(btnZero);
        numpad.add(btnDot);
        numpad.add(btnEquals);
        numpad.add(btnDivide);

        pnlDisplay.add(txtDisplay);

        Container screen = getContentPane();
        numpad.setLayout(new GridLayout(4, 4));
        screen.add(numpad);
        pnlDisplay.setLayout(new GridLayout(1, 1));
        screen.add(pnlDisplay, BorderLayout.NORTH);

        btnZero.addActionListener(new btnZeroActionListener());
        btnOne.addActionListener(new btnOneActionListener());
        btnTwo.addActionListener(new btnTwoActionListener());
        btnThree.addActionListener(new btnThreeActionListener());
        btnFour.addActionListener(new btnFourActionListener());
        btnFive.addActionListener(new btnFiveActionListener());
        btnSix.addActionListener(new btnSixActionListener());
           btnSeven.addActionListener(new btnSevenActionListener());
              btnEight.addActionListener(new btnEightActionListener());
                 btnNine.addActionListener(new btnNineActionListener());
                 
                 btnDot.addActionListener(new btnDotActionListener());
                 btnAdd.addActionListener(new btnAddListener());
                 btnMultiply.addActionListener(new btnMultiplyListener());
btnSubtract.addActionListener(new btnSubtractListener());
btnDivide.addActionListener(new btnDivideListener());
btnEquals.addActionListener(new btnEqualsListener());
        
    }

    class btnZeroActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "0");

        }
    }

    class btnOneActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "1");

        }
    }

    class btnTwoActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "2");

        }
    }

    class btnThreeActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "3");

        }
    }

    class btnFourActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "4");

        }
    }

    class btnFiveActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "5");

        }
    }

    class btnSixActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "6");

        }
    }

    class btnSevenActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "7");

        }
    }

    class btnEightActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "8");

        }
    }

    class btnNineActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + "9");

        }
    }
    class btnDotActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + ".");

        }
    }
      class btnAddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(txtDisplay.getText());
             display = txtDisplay.getText();
                        txtDisplay.setText(display + " + ");
                        operator= 1;
        }
      }
        class btnSubtractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
           txtDisplay.setText(display + " - ");
           operator=2;
        }
    }
    class btnMultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
           txtDisplay.setText(display + " * ");
         operator =3;
         
        }
    }
    class btnDivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txtDisplay.getText();
            txtDisplay.setText(display + " / ");
            operator =4;
        }
    }
    class btnEqualsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
       String answer ="";
                        if (operator ==1)
                            answer=display + txtDisplay.getText();
                        txtDisplay.setText(answer);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Calculator();
    }

}
