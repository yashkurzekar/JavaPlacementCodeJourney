package testQuestions;

import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.println("a= "+a+" b= "+b);

        c = a;
        a = b;
        b = c;
        System.out.println("a= "+a+" b= "+b);
    }
}
