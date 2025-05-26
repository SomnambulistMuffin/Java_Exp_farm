package vut.MoviePatron;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double grade,score;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade");
        grade = input.nextDouble();

        System.out.println("enter score");
        score  = input.nextDouble();

        if (grade<=0.0 & grade>= 5.0)
        {
            if (score >= 0 & score <=  100)
            {
                if ( grade>= 2.0 & score >= 50)
                {
                    System.out.println("accepted");
                }  else if ( grade>= 3.0 & score >= 60)
                {
                    System.out.println("accepted");
                }  else if ( grade>= 4.0 & score >= 80)
                {
                    System.out.println("accepted");
                }
            }

        } else {
            System.out.println("Rejected");
        }



    }
}
