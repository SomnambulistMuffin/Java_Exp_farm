package vut.Question1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        double total = 0 , average;
        int highestpos,lowpos;
        ArrayList<Integer> arrListNum = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String[] arrNum = new String[10];



        for (int i = 0; i < arrNum.length; i++) {
            try {

                arrNum[i] =input.nextLine();
                total = total + arrListNum.get(i);
                arrListNum.add(Integer.parseInt(arrNum[i]));

            }catch (NumberFormatException ex){

            }
            System.out.println(arrListNum);


        } int[] vals = new int[arrListNum.size()];

        for (int j = 0; j < vals.length; j++) {
            vals[j] = arrListNum.get(j);


        }
        System.out.println(Arrays.toString(vals));
    }
    private double calcAverage(ArrayList<Integer> arLstNum, double total ){
        if (!arLstNum.isEmpty()){
            return total/ arLstNum.size();
        }
    }
}
