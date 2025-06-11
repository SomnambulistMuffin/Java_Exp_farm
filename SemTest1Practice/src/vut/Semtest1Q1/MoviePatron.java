package vut.Semtest1Q1;

public class MoviePatron {
    private String name;
    private double age;
    private double price=0.0;
    //constructor
    public MoviePatron(){
        this("none",0);
    }

    //overloaded constructor
    public MoviePatron(String name,double age){
    setAge(age);
    setName(name);
price = getPrice();


    }
//name accessor
    public void setName(String name) {
        if (name.length()>3){
            this.name = name;
        }else{
            this.name = "none";
        }


    }

    public void setAge(double age) {
        if (age >=0 & age <= 100)
        {
            this.age = age;
        } else {
            this.age = 0;
        }

    }
//name mutator
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public double calcPrice(int day, char seat)
    {
        //constant variables
        final double PRICE_1 = 82.22;
        final double PRICE_2 = 86.48;
        final double PRICE_3 = 85.25;
        final double PRICE_4 = 89.33;
        final double AGE_LIMIT = 18;
        final double DISCOUNT_1 = 0.087;
        final double DISCOUNT_2 = 0.05;
        //double price = 0.0;

        if ((day>=1 &  day<=7) & (seat == 'F' | seat == 'B'))
        {
            if (getAge() <= AGE_LIMIT)
            {
                //mon to thurs
                if (day>=1 & day<=4)
                {
                    price = PRICE_3;
                }else{
                    price = PRICE_1;
                }
            }else{
                if (day>=1 & day<=4)
                {
                    price = PRICE_4;
                }else{
                    price = PRICE_2;
                }
            }
            if ((day == 5 || day == 6) & seat == 'F')
            {
                price = price- (price*DISCOUNT_1);
            } else if (day == 7 & seat == 'F')
            {
                price = price - (price*DISCOUNT_2);
            }

        }else {
            System.out.println("Invalid data entered");
        }
        return  price;
    }

    @Override
    public String toString() {
        return "name is :" + getName() +
                "\nAge is: " + getAge() +
                "\nPrice is: " + getPrice();
    }
}
