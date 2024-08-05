package com.example.practiceproject;

public class sample {
    public static void main(String[] args) {
        int[] i = {2,4,6,8,3,9,10,34,56,91};
        int avg =0;
        int sum=0;
        for(int j=0;j<i.length;j++){
            sum+=i[j];
            avg=sum/i.length;
        }
        System.out.println("The average of the numbers is: "+avg);
    }
}
