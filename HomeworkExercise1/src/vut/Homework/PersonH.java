package vut.Homework;

public class PersonH {
// Person's attributes
    String name;
    Integer age;

    /**
     * default constructor of the personH class
     */
    public PersonH()
    {
        this("none",0);



    }

    /**
     * overloaded constructor of the PersonH class
     * @param name Person's name
     * @param age   Person's age
     */
    public PersonH(String name, Integer age)
    {
        setName(name);
        setAge(age);


    }

    /**
     * behaviour Age accessor
     * @param age Person's age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * behaviour age accessor
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * behaviour birthday which increments a person's age
     * @return
     */
 public Integer haveBirthday()
 {

     return  age++ ;

 }

    /**
     * toString behaviour for diaplaying values
     * @return
     */
 @Override
    public String toString()
 {
     return "The Person's name is: " + name +
                        "\nthe"+name+ "'s age is: " + age ;
 }

}
