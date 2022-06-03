package testQuestions;

import java.util.Scanner;

public class gretestNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Please Enter 2st Number");
        int b = sc.nextInt();
        System.out.println("Please Enter 3st Number");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest number");
            } else {
                System.out.println(c+" is greatest Number");
            }
        }
        else {
            if (b>c){
                System.out.println(b+" is greatest number");
            } else {
                System.out.println(c +" is greatest number");
            }
        }
    }
}
