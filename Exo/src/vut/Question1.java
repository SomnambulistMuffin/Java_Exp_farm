/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author 2000000
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare var
        double grade, score;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade");
        grade = input.nextDouble();

        System.out.println("Enter score");
        score = input.nextDouble();

        if (grade >= 0.0 & grade <= 5.0) {
            if (score >= 0 & score <= 100) {

//                if(score>=2.0 & grade>=50){
//                    System.out.println("Accept");
//                }else if(score>=3.0 & grade>=60){
//                     System.out.println("Accept");
//                }else if(score<6.0 & grade>=80){
//                     System.out.println("Accept");
//                }
                if (score >= 2.0 & grade >= 50
                        | score >= 3.0 & grade >= 60
                        | score < 6.0 & grade >= 80) {
                    {

                        System.out.println("Accept");
                    }

                } else {
                    System.out.println("Score not vallid");
                }

            } else {
                System.out.println("Grade not valid");
            }

        }

    }}
