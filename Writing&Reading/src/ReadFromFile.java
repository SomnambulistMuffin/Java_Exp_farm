
import java.io.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author st
 */
public class ReadFromFile
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String rLine,name,gender;
        String []arSplit;
        double salary;
        
        try{
            FileReader fread = new FileReader("empFile.txt");
            Scanner scRead = new Scanner(fread);
            
            while(scRead.hasNextLine()){
                rLine = scRead.nextLine();
                arSplit = rLine.split(" , ");
                name = arSplit[0];
                gender = arSplit[1];
                salary = Double.parseDouble(arSplit[2]);
                System.out.println( name + "\t" + gender +"\t" + salary);
                fread.close();
            }
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
