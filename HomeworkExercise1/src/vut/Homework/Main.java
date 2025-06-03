package vut.Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //declarations
        String name;
        Integer age;
        PersonH moron;

        Scanner input = new Scanner(System.in);
        moron = new PersonH();

        name = getName(input);
        age = getAge(input);

        moron = createHuman(name,  age);



        moron.haveBirthday();
        display(moron);




    }
    public static String getName(Scanner input)
    {
        System.out.println("please enter Name");
        return input.next();
    }
    public static Integer getAge(Scanner input)
    {
        System.out.println("Please enter age: ");
        return input.nextInt();
    }

    public static void display(PersonH moron)
    {
        System.out.println(moron.toString());
    }

    private static PersonH createHuman(String name, Integer age)
    {

        return new PersonH(name,age);
    }
}
