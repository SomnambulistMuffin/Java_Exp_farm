/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author admin
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MoviePatron movie = new MoviePatron("Sue Motloung", 20);

        movie.calcMoviePrice(1, 'B');
        System.out.println(movie.toString());

        movie.calcMoviePrice(5, 'F');
        System.out.println(movie.toString());
        
        movie.calcMoviePrice(5, 'F');
        System.out.println(movie.toString());
    }

}
