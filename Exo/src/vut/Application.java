/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age, dayNumber;
        char seat;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        name = input.nextLine();

        System.out.println("Enter age");
        age = input.nextInt();
        MoviePatron movie = new MoviePatron(name, age);

        System.out.println("Enter Day number");
        dayNumber = input.nextInt();

        System.out.println("Enter seat");
        seat = input.ne xt().charAt(0);

        movie.calcMoviePrice(dayNumber, seat);

        System.out.println(movie.toString());

    }

}
