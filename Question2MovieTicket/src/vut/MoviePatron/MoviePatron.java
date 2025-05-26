package vut.MoviePatron;

public class MoviePatron {

    private String name;
    private int age;

public MoviePatron()
{
    this("none",0);
}
public MoviePatron(String name,int age)
{
    setName(name);

    setAge(age);

}

    public void setName(String name) {
    if(name.length() > 3)
    {
        this.name = name;
    } else {
        this.name = "none";
    }

    public int getAge( ){
        return age;
        }

    public void setAge(int age){
            if (age >= 0 & age <= 10) {

                this.age = age;
            } else {
                this.age = 0;
            }

        }


        public double calcMoviePrice(int day,int age) {
        //constants
            final double PRICE_1 = 82.22;
            final double PRICE_2 = 86.48;
            final double PRICE_3 = 85.25;
            final double PRICE_4 = 89.33;

            if (day >= 5 & day<= 7 & age<= AGE_18)
            {

            }
        }else if(day >= 5 & day<= 7 & age> AGE_18) {


        }
        }
}
