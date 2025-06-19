/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author st
 */
public class Program1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        double arPrices[][] = {{1500,1650,800},{900,1100,1300},{1800,2000,2200},{2500,2300,3000}};
        
        int floor,bedrooms;
        Scanner input = new Scanner(System.in);
        
        for (int row = 0; row < arPrices.length; row++){
            for(int col = 0; col < arPrices[row].length;col++){
                System.out.print(String.format("%10.2f",arPrices[row][col]));
            }
            System.out.println(" ");
        }
        for(int cnt = 0; cnt < 5; cnt++){
            System.out.println("Enter the floor 0- ground floor, 1 - 1st floor, 2 - 2nd floor and 3  - 3rd floor ");
            floor = input.nextInt();
            if (floor >= 0 && floor < arPrices.length){
                System.out.println("Enter the number of bedrooms (1,2,3)");
                bedrooms = input.nextInt();
                
                bedrooms--;
                if(bedrooms >= 0 && bedrooms < arPrices[floor].length){
                    System.out.println(String.format("%2.2f",arPrices[floor][bedrooms]));
                
                            
                }else{
                    System.out.println("Invalid number of bedrroms");
                }
            }else{
                System.out.println("Invalid floor number entered");
            }
        }
    }
    
}
