package vut.Decision;

public class Decision {


    private char vowel;

    /**
     * default constructor
     */
    public Decision()
    {
        this('a');

    }

    /**
     * overloaded constructor
     * @param vowel
     */
    public Decision(char vowel)
    {
        vowel = getVowel();
    }

    /**
     * mutator for variable vowel's value
     * @return value of vowel
     */
    public char getVowel() {
        return vowel;
    }

    /**
     * this method is used to get the vowel then determine whether it's a vowel or consonant
     * @param vowel character which gets calculated to be a vowel or consonant
     * @return tells the user whetehr the character entered is a vowel consonant or invalid
     */
    public String haveVowel(char vowel)
    {

       boolean isVowel = false; //boolean value that is set false for not being a vowel that was entered


        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
        }
        if (isVowel == true){
            return vowel + "is a vowel";
        }
        else {
            if (vowel >= 'a' && vowel<= 'z')
                return vowel + "is a consonant";
                else
                    return "input is not an alphabet";
        }

    }
}
