package com.example.practiceproject;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Controller {

    public static void main(String[] args) {
        String[] names= {"max","sam","dany","tom","bobby"};
        int i= names[0].length();
        int maxIndex = 0;
        for(int j=1;j< names.length;j++){
            if (names[j].length() > i){
                i = names[j].length();
                maxIndex = j;
            }

        }
        System.out.println("The maximum length word is: "+names[maxIndex]+" and it's index is: "+maxIndex);

        int[] x ={1,2,3,4,5,6,7,8,9};
        System.out.println("\n Original integer array "+Arrays.toString(x));
        for(int y=0; y< x.length/2;y++){
            int temp = x[y];
            x[y]=x[x.length-y-1];
            x[x.length-y-1] = temp;
        }
        System.out.println("\nThe Reversed integer array is: "+Arrays.toString(x));

    }
}
