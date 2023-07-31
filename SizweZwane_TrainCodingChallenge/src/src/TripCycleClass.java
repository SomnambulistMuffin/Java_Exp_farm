
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class TripCycleClass {

    //using hamiltonian cycle algorithm to get shortest route
    static int findShortestCycle(int[][] distance, boolean[] visitCity,int currPos, int cities, int count, int cost, int Cycle){

        if (count == cities && distance[currPos][0]>0){
            Cycle = Math.min(Cycle, cost + distance[currPos][0]);
            return Cycle;
        }

        //back tracking

        for (int i = 0; i <cities ; i++) {
            if (visitCity[i]== false && distance[currPos][i]>0){
                // mark visited
                visitCity[i] = true;
                Cycle = findShortestCycle( distance,visitCity,i,cities, count +1,cost + distance[currPos][i],Cycle );

                //marking nth node as visited

                visitCity[i] = false;


            }
        }
        return Cycle;
    }

    public static void main(String[] args) {

        int cities;

        Scanner sc = new Scanner( System.in );

        System.out.println("enter total number");

        cities = sc.nextInt();

        int distance[][] = new int[cities][cities];
        for (int i = 0; i <cities ; i++) {
            for (int j = 0; j < cities; j++) {
                System.out.println("distance from city" + (i+1)+ "to city"+ (j+1)+ ":");
                distance[i][j]= sc.nextInt();
            }
        }

        boolean[] visitCity = new boolean[cities];

        visitCity[0]= true;

        int Cycle = Integer.MAX_VALUE;

        Cycle = findShortestCycle( distance,visitCity,0,cities,1,0,Cycle );

        System.out.println(Cycle);
    }
}
