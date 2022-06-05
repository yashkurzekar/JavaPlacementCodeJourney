package testQuestions;

import java.util.Scanner;
//Write a Java program that takes a number as input and prints its multiplication table upto
//10.
public class tableOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which number table you want to print? ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i +"= "+(num*i));
        }

    }
}
