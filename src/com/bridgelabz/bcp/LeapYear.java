package com.bridgelabz.bcp;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter year : ");
        int year=scanner.nextInt();

        if (year%400==0 || year%100 !=0 && year%4==0){
            System.out.println(year+" is Leap year");
        }else {
            System.out.println(year+" is Not Leap year");
        }
    }
}
