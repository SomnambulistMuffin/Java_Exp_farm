package vut.EmployeeTester;

public class Employee {

    private String name;
    private  double salary;

public Employee()throws Exception{
    this("none",0.0);
}

public Employee(String name, double salary)throws Exception{
    setName(name);
    setSalary(salary);
}

    public void setName(String name) throws Exception {

    if(name.length()> 3){
            this.name = name;

    }else{
        throw new Exception("invalid name entered");
    }

    }

    public void setSalary(double salary)throws Exception {
        if(this.salary> 0.0){
            this.salary = salary;

        }else{
            throw new Exception("invalid salary entered");
        }

    }



    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
    if (percentage>0.0){
        this.salary=this.salary+(this.salary*percentage);
        this.salary+=(this.salary*percentage);

    }else {
        throw new E("invalid percentage enetered");
    }


    }

    @Override
    public String toString() {
        return "the name is " + getName() + "\nyour salary is" + getSalary();
    }
}
