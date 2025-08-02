/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author st
 */
public class MainMenuStreamz
{
    private  static ArrayList<Employee> arEmp = new ArrayList<>();

    //method to save  
//to be called within the exit menu (saveToFile)
       
    public static void saveToFile(){
      
    try{
        
        FileOutputStream fas = new FileOutputStream("Employee.dat");
        ObjectOutputStream objStr = new ObjectOutputStream(fas);
        Employee emp = new Employee("test",23990);
        objStr.writeObject(emp);
        objStr.close();
        
        
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex.getMessage());
     }
    }
 
     public static void readFromFile(){
      
    try{
        FileInputStream fis =new FileInputStream("Employee.dat");
        ObjectInputStream objRead = new ObjectInputStream(fis);
        Employee emp = new Employee();
        emp = (Employee)objRead.readObject();
        
        System.out.println(emp.toString());
        objRead.close();
    
      
     }catch(FileNotFoundException ex){
    JOptionPane.showMessageDialog(null, ex.getMessage());
     }
       catch(IOException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    catch(ClassNotFoundException ex){
     JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }
    
    public static void main(String[] args)
    {
           
       saveToFile();
       readFromFile();
        
       
    }
    
}
