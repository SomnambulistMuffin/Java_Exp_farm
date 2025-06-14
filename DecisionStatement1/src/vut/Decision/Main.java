package vut.Decision;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Decision letter = new Decision();

        Scanner ask = new Scanner(System.in);
        System.out.println("Enter character: ");

        char vowel = ask.next().charAt();


        letter.haveVowel(vowel);



    }
}
