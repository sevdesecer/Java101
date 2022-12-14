package Exercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SortByHeight {
    public static void main(String[] args) {
        String [] names1 = {"Bilal" ,"Bahar" ,"Enhar"};
        String [] names2 = {"Gizem" ,"Ozan" ,"Ege" ,"Meral"};
        String [] names3 = {"Haitham" ,"Losine"};

        int [] heights1 = {185, 169, 170};
        int [] heights2 = {173, 171, 178, 166};
        int [] heights3 = {181, 171};

        System.out.println(Arrays.toString(sortByHeight(names1, heights1)));
        System.out.println(Arrays.toString(sortByHeight(names2, heights2)));
        System.out.println(Arrays.toString(sortByHeight(names3, heights3)));
    }
    public static String[] sortByHeight(String[] names, int[] heights){

        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1 ; j < heights.length; j++) {
                if(heights[i] < heights[j]){
                    //swap
                    int tempHeight = heights[i];
                    String tempName =  names[i];

                    heights[i] = heights[j];
                    heights[j] = tempHeight;

                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        return names;
    }
}
