/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author Mpela
 */
public class PersonApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
           Scanner input = new Scanner(System.in);
        String name;
        int age;
        Person objPerson;
        
        System.out.print("Enter name: ");
        name = input.nextLine();
        
        System.out.print("Enter age: ");
        age = input.nextInt();
        
//      objPerson = new Person();
        objPerson = new Person(name, age);
        
        objPerson.haveBirthday();
        objPerson.haveBirthday();
        System.out.println("Hi " + objPerson.getName()  + " ! You are " + objPerson.getAge() + " years old");
         
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
