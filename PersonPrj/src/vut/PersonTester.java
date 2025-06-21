/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Mpela
 */
public class PersonTester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            String name = "Sonia Mothoung";
            int age = -20;

            Person objPerson = new Person(name, age);
            System.out.println("Hi " + objPerson.getName() + " ! You are " + objPerson.getAge() + " years old");

            objPerson.haveBirthday();
            objPerson.haveBirthday();

            System.out.println("Hi " + objPerson.getName() + " ! You are " + objPerson.getAge() + " years old");

            System.out.println(objPerson.toString());
        }
        
        catch (IllegalArgumentException e)
        {
            
              System.out.println(e.getMessage());
        }

    }

}
