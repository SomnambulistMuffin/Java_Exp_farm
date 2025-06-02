/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 * This class must store the name and age of a movie patron
 *
 * @author 20000
 */
public class MoviePatron {

    //instance vars
    private String name;
    private int age;

    public MoviePatron() {
        this("none", 0);
    }

    public MoviePatron(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void setAge(int age) {
        if (age >= 0 & age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }

    }

    public void setName(String name) {
        if (name.length() > 3) {
            this.name = name;
        } else {
            this.name = "none";
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * this calculate the price
     *
     * @param day
     * @param seat
     * @return price
     */
    public double calcMoviePrice(int day, char seat) {

        //CONSTANT VARS
        final double PRICE_1 = 82.22;
        final double PRICE_2 = 86.48;
        final double PRICE_3 = 85.25;
        final double PRICE_4 = 89.33;
        final double AGE_LIMIT = 18;
        final double DISCOUT_1 = 0.087;
        final double DISCOUT_2 = 0.05;
        double price = 0.0;

        if ((day >= 1 & day <= 7) & (seat=='F' | seat=='B')) {

            //lest than 18
            if (getAge() <= AGE_LIMIT) {
                //mond to thur
                if (day >= 1 & day <= 4) {
                    price = PRICE_3;
                    //fri sat sun
                } else {
                    price = PRICE_1;
                }

                // more than 18
            } else {
                //mond to thur
                if (day >= 1 & day <= 4) {
                    price = PRICE_4;
                    //fri sat sun
                } else {
                    price = PRICE_2;
                }
            }

            if ((day == 5 | day == 6) & seat == 'F') {
                price = price - (price * DISCOUT_1);
            } else if (day == 7 & seat == 'F') {
                price = price - (price * DISCOUT_2);
            }
            //invalid
        } else {
            System.out.println("Invalid data");
        }
        return price;
    }
    @Override
    public String toString() {
        return "Name is " + getName()
                + "\nAge is " + getAge();
    }

}
