package vut.Decision;

public class DecisionTest {

    /**
     * testing out that the Decision class works
     * @param args
     */
    public static void main(String[] args) {
        Decision vowel = new Decision();

        System.out.println();
        System.out.println("***************");

        vowel.getVowel();


        System.out.println(vowel.haveVowel('e'));
    }



}
