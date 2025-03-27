/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author 200000
 */
public class Employee {

    /*Instance variables*/
    private String name;
    private double salary;

    /**
     * Default constructor
     */
    public Employee() {
        this("none",0);
    }

    /**
     * Parameterized constructor
     *
     * @param name
     * @param salary
     */
    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    /**
     * Setting Name with validation
     *
     * @param name
     */
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    /**
     * setting Salary with validation
     *
     * @param salary
     */
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Invalid salary");
        }
    }

    /**
     * getting name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getting salary
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Increase Salary by a given percentage
     * @param percentage 
     */
    public void increaseSalary(double percentage) {
        /*checking if valid percentage*/
        if (percentage >= 0 & percentage <= 100) {
            /*increase the salary with the given percentage*/
            this.salary = this.salary + (this.salary * percentage / 100);
        } else {
            throw new IllegalArgumentException("Invald percentage");
        }
    }

    @Override
    public String toString() {
        return "Name is : " + name + " \nSalary is: " + salary;
    }

}
