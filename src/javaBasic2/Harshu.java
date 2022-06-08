package javaBasic2;

import java.util.Scanner;

public class Harshu {
    static int n1=0,n2=1,n3=0;
    int count=0;
    static void fbiseries(int a){
        if(a>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fbiseries(a-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fib series you want");
        int count = sc.nextInt();
        System.out.print(n1+" "+n2);
        fbiseries(count-2);


    }
}
