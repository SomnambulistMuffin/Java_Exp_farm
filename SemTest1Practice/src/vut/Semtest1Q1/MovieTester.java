package vut.Semtest1Q1;

import java.util.Scanner;

public class MovieTester {
    public static void main(String[] args) {
        MoviePatron movie = new MoviePatron("Sue Motloung",20);

        movie.calcPrice(7,'F');
        System.out.println(movie.toString());

        movie.calcPrice(5,'B');
        System.out.println(movie.toString());

        movie.calcPrice(1,'F');
        System.out.println(movie.toString());

    }



}
