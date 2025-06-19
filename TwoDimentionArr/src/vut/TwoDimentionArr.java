/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author st
 */
public class TwoDimentionArr
{
 ArrayList<String> arNum = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        final int MAX_STUDENTS = 2;
        final int MAX_MARKS = 3;
        
        
       
        
        double arMarks[][] = new double [MAX_STUDENTS][MAX_MARKS];
        double totMarks;
        double avg;
        double mark;
        Scanner input = new Scanner(System.in);
        
        for (int row = 0; row < arMarks.length; row++){
            System.out.println("Student " + (row +1));
            for (int col = 0; col < arMarks[row].length; col++){
                System.out.println("Enter mark " + (col +1));
                mark = input.nextDouble();
                
                arMarks[row][col] = mark;
                
            }
        }
        
        for (int row = 0; row < arMarks.length; row++){
             System.out.println("Student " + (row +1));
            for (int col = 0; col < arMarks[row].length; col++){
                System.out.print(arMarks[row][col] + "  ");
            }
            System.out.println(" ");
        }
        for (int row = 0; row < MAX_STUDENTS; row++){
            System.out.println("Student " + (row +1));
            totMarks = 0;
            for (int col = 0; col < MAX_MARKS; col++){
                totMarks = totMarks + arMarks[row][col];    
                
            }
            avg = totMarks/MAX_MARKS;
            System.out.println("Average: " + avg);
        }
    }
    
}
