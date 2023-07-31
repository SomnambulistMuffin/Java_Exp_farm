package vut;


public class Employee {
    
    private String name;
    private double salary;

    public Employee() {
        this("none",0.00);
    }

    public Employee(String name, double salary) {

        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >3) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("invalid name entered");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0 ){
            this.salary = salary;
        }else {
            throw new IllegalArgumentException("invalid salary entered");
        }


    }
    public void increaseSalary(double percentage){

        if ((percentage >= 0)&&(percentage <= 100)){
            this.salary = this.salary +(this.salary * percentage);
        }else {
            throw new IllegalArgumentException("invalid percentage entered");
        }
    }

    @Override
    public String toString() {
            return "Name: " + getName() + "\ntotal salary: " + getSalary();
    }
}
    
    

