package vut.MoviePatron;

public class MoviePatron2 {
    private String name;
    private int age;


    public void setName(String name) {
        if(name.length() > 3)
        {
            this.name = name;
        } else {
            this.name = "none";
        }
    }
    public void setAge(int age) {
        if (age >= 0 & age <= 10) {

            this.age = age;
        } else {
            this.age = 0;
        }
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
