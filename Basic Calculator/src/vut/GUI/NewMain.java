/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Novish
 */
public abstract class NewMain implements ActionListener{
    
    JFrame objFrame;
    JPanel objButton;
    JTextField objTextField;
    int calcOperation = 0;
    
       public NewMain(){
           objFrame = new JFrame();
           objFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           objFrame.setSize(200, 200);
           objFrame.setTitle("Basic Calculator");
           objFrame.setVisible(true);
           
           objTextField = new JTextField("0");
           objTextField.setEnabled(false);
           objFrame.add(objTextField, BorderLayout.NORTH);
           
           
           objButton = new JPanel();
           objButton.setLayout(new GridLayout(4,4));
           objFrame.add(objButton, BorderLayout.CENTER);
           
           
           
          JButton addButton = new JButton("+");
          addButton.setActionCommand("+");
           
           JButton subButton = new JButton("-");
          subButton.setActionCommand("-");
           
           JButton multiplyButton = new JButton("*");
           multiplyButton.setActionCommand("*");
              
          JButton divideButton = new JButton("/");
           divideButton.setActionCommand("/");
           
           OperatorAction addAction = new OperatorAction(1) {
               @Override
               public void actionPerformed(ActionEvent ae)  {
               String action = ae.getActionCommand();
               objTextField.setText(action);       
            }
           };
           subButton.addActionListener((ActionListener) addAction);
           
           
           OperatorAction subAction = new OperatorAction(2) {
               @Override
              public void actionPerformed(ActionEvent ae) {
               String action = ae.getActionCommand();
              objTextField.setText(action);       
           }
           };
          addButton.addActionListener((ActionListener) subAction);
           
           
            OperatorAction divideAction = new OperatorAction(3) {
              @Override
               public void actionPerformed(ActionEvent ae) {
               String action = ae.getActionCommand();
               objTextField.setText(action);       
            }
           };
           multiplyButton.addActionListener((ActionListener) divideAction);
           
           
           
            OperatorAction multiplyAction = new OperatorAction(4) {
               @Override
               public void actionPerformed(ActionEvent ae) {
               String action = ae.getActionCommand();
               objTextField.setText(action);       
            }
           };
          divideButton.addActionListener((ActionListener) multiplyAction);
           
           
           
           
          JButton equalsButton = new JButton("=");
          equalsButton.setActionCommand("=");
          equalsButton.addActionListener((ActionListener) equalsButton);
          
          
          
          
            for (int i=0;i<10;i++)
        {
            ButtonList(objButton, String.valueOf(i));
        }
        
         objButton.add(addButton);
        objButton.add(subButton);
        objButton.add(multiplyButton);
        objButton.add(divideButton);
       objButton.add(equalsButton);
        objFrame.setVisible(true); 
       }
        
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
         new SimpleCalc();         
             
    }

   private void ButtonList(Container parent, String name)
    {
        JButton but = new JButton(name);
        but.setActionCommand(name);
        but.addActionListener(this);
        parent.add(but);
    }



    
    private abstract class OperatorAction implements ActionListener{
        
        private int operator;
        public OperatorAction(int operation) {
            operator = operation;
        }
        
        
         public void actionPerformed(ActionEvent event)
        {
            int calculate = 0;
                    
          if (!objTextField.getText().isEmpty())
                {
                    int number = Integer.parseInt(objTextField.getText()); 
                    if (calcOperation == 1)
                    {
                        calculate = calculate  + number;
                        objTextField.setText(Integer.toString(calculate));
                    }
                   else if (calcOperation == 2)
                    {
                        calculate = calculate  - number;
                        objTextField.setText(Integer.toString(calculate));
                   } else if (calcOperation == 3)
                    {
                        calculate = calculate  * number;
                        objTextField.setText(Integer.toString(calculate));
                    } else if (calcOperation == 4)
                    {
                        calculate = calculate  / number;
                        objTextField.setText(Integer.toString(calculate));
                    }
                    
            calculate = Integer.parseInt(objTextField.getText()); 
            calcOperation = operator;
                }
        }
    }

   
       
    
}
