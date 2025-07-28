/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_write;

/**
 *
 * @author st
 */
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Read_Write
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       String answer = JOptionPane.showInputDialog("Type \"read\" or \"write\"");
    while(!answer.equalsIgnoreCase("write")||!answer.equalsIgnoreCase("read")){
       
        if (answer.equalsIgnoreCase("read"))
        {
            Read();
            JOptionPane.showMessageDialog(null, "Done");
             answer = JOptionPane.showInputDialog("Type \"read\" or \"write\"");
        }
        else if (answer.equalsIgnoreCase("write"))
        { Write();
            JOptionPane.showMessageDialog(null, "Done");
             answer = JOptionPane.showInputDialog("Type \"read\" or \"write\"");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "TYPE THE CORRECT STRING");
         answer = JOptionPane.showInputDialog("Type \"read\" or \"write\"");
            
        }
    }
    }
    public static void Read(){
            String rLine, gender, name;
            String[] arSplit;
            double salary;

            try
            {
                FileReader fRead = new FileReader("NewFile.txt");
                Scanner scRead = new Scanner(fRead);
                while (scRead.hasNextLine())
                {
                    rLine = scRead.nextLine();
                    arSplit = rLine.split(",");
                    name = arSplit[0];
                    gender = arSplit[1];
                    salary = Double.parseDouble(arSplit[2]);
                    System.out.println(name + "\t" + gender + "\t" + salary);
                }
            }
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }}
    public static void Write(){
   
            Scanner in = new Scanner(System.in);
            try
            {;
                String name = JOptionPane.showInputDialog("Name");
                String gender = JOptionPane.showInputDialog("Gender");
                double salary = Double.parseDouble(JOptionPane.showInputDialog("Salary"));

                FileWriter fWrite = new FileWriter("NewFile.txt", true);
                PrintWriter pWrite = new PrintWriter(fWrite);
                pWrite.println(name + "," + gender + "," + salary);
                pWrite.close();

            }
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
        }
}