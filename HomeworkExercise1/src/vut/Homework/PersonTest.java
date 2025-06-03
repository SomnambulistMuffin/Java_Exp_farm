package vut.Homework;

/**
 * class to test PersonH class for bugs and logic implementation
 */
public class PersonTest {

    public static void main(String[] args) {
        String name ;
        Integer age ;
        PersonH human;

        human = new PersonH();

        System.out.println(human);

        human.setAge(3);
        human.setName("Sonia Motluang");
        human.haveBirthday();
        human.haveBirthday();


        System.out.println(human.toString());
        System.out.println("******************");


        human.setName("Sonia Motluang");
        human.setAge(3);
        human.haveBirthday();
        human.haveBirthday();
        System.out.println(human.toString());
    }



}
