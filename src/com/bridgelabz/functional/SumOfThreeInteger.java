package com.bridgelabz.functional;

public class SumOfThreeInteger {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 0, -1, 2, -3, 4};
        for (int i = 0; i <arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.println("Distinct triplets :"+arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
}
