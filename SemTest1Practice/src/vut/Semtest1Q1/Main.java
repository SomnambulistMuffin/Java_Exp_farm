package vut.Semtest1Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double score  ;
        double grade ;

        Scanner input = new Scanner(System.in);

        //getting the input for the grade
        System.out.println("Enter grade: ");
        grade = input.nextDouble();

        //getting the score from the user
        System.out.println("Enter score");
        score = input.nextDouble();

        if (grade <= 0.0 & grade >=5.0)
        {
            if (score >=0 & score<=100)
            {
                //long method
                /*if (grade>= 2.0 & score >=50) {
                    System.out.println("accepted");
                }else if (grade>= 3.0 & score >=60) {
                    System.out.println("accepted");
                }
                       else if (grade <= 5.0 & score >=80) {
                            System.out.println("accepted");
                        } else{
                    System.out.println("Rejected");
                }*/

                if (grade>= 2.0 & score >=50 |
                        grade>= 3.0 & score >=60 |
                        grade <= 5.0 & score >=80)
                {
                    System.out.println("accepted");
                }else {
                    System.out.println("Rejected");
                }



            }else {
                System.out.println("invalid score entered");
            }

        } else {
            System.out.println("invalid grade entered");
        }
    }
}
