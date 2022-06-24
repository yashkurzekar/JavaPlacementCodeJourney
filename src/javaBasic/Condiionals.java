package javaBasic;

import java.util.Scanner;

public class Condiionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age = sc.nextInt();
//        System.out.println("Voting Started");
//
//        if(age >= 18)
//        {
//            System.out.println("Voting Started");
//            System.out.println("Hurry");
//        }
//        else {
//            System.out.println("Play Games");
//        }
//        System.out.println("Voting ended");
//        System.out.println("Enter Your marks");
//        float marks = sc.nextInt();
//
//        if(marks > 90)
//        {
//            System.out.println("A+");
//        } else if (marks>80) {
//            System.out.println("A");
//        } else if (marks>70) {
//            System.out.println("B");
//        } else if (marks>60) {
//            System.out.println("C");
//        } else  {
//            System.out.println("D");
//        }

//        int a = 3;
//        int b = 4;
//        int c = 5;
//
//        if(a>b){
//            if(a>c){
//                System.out.println("a");
//            } else {
//                System.out.println("c");
//            }
//        } else {
//            if(b>c) {
//                System.out.println("b");
//            }
//            else {
//                System.out.println("c");
//            }
//        }

        //Switch Case
       
        int number = 2;

        switch(number){
            case 1:
                System.out.println("Yash");
                break;
            case 2:
                System.out.println("Shrawasti");
                break;
            case 3:
                System.out.println("Ojas");
                break;
            case 4:
                System.out.println("Jay");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
