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
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "none";
        age = 1;
    }

    public Person(String name, int age) {
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) 
    { 
        if (name.length() < 3)
        {
           throw new IllegalArgumentException("Can not be less than 3 characters");
        }
        else
        {
            this.name = name; 
        }
                 
    }

    public void setAge(int age)
    {    
        if (age < 0)
        {
         throw new IllegalArgumentException("Age can can not be negative ");
        }
        else
        {
              this.age = age;
        }
        
          
    }
    
    public void haveBirthday(){
        age +=1;
    }

    @Override
    public String toString()
    {
        return  "name = " + name + "\n age = " + age ;
    }

    
}
