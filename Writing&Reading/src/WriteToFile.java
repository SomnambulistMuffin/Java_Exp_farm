/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author st
 */
public class WriteToFile
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name ");
        String name =sc.next();
        System.out.println("Enter gender ");
        String gender = sc.next();
        System.out.println("Enter salary ");
        double salary = sc.nextDouble();
       
        try{
            FileWriter fwrite = new FileWriter("empFile.txt",true);
            PrintWriter pwrite = new PrintWriter(fwrite);
            
            pwrite.println(name + " , " + gender + " , " + salary);
            pwrite.close();
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
