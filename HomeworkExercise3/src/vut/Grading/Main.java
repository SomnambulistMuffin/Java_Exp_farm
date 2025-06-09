package vut.Grading;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double grade = 0.0;
	//Double number;


        Scanner input = new Scanner(System.in);
        System.out.println("please enter the test score ");
        boolean isScore = (grade == ' ')? false: true; // validates that the grade contains no null values





        if (isScore)
        {
            // validates if the character entered is a number or not
            //(double) number ? grade = input.nextDouble()  : System.out.println('Error value needs to be numeric');


            Grade score = new Grade();

            score.setGrade(grade);
            score.calcGrade(grade);

            System.out.println(score.toString());
        } else
        {
            System.out.println("invalid Score entered");
        }

    }
}
