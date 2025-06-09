package vut.Grading;

import java.util.Scanner;

public class GradeTest {

    public static void main(String[] args) {

        double grade;


        Scanner input = new Scanner(System.in);
        System.out.println("please enter Test score");
        grade = input.nextDouble();

        Grade score = new Grade();

        score.calcGrade(grade);
        score.setGrade(grade);
        System.out.println(score.toString());
        System.out.println("*************");
    }
}
