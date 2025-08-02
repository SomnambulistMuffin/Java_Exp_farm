/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.io.Serializable;

/**
 *
 * @author st
 */
public class Employee implements Serializable
{
    private String name;
    private double salary;

    public Employee()
    {
        this.name = "";
        this.salary =0;
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
    
    
    
    
    
}
