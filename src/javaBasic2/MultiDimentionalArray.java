package javaBasic2;

import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a[] [] = new int[2][3];
        //1st []row 2nd []col
        int b[] [] = {
                {1,2,3,4},

                {5,6,7,8}
        };
        System.out.println(b[1][3]);
        int c = sumof(5,5);
        System.out.println(c);
    }
    //function and method is same just a diff name
    public static int sumof(int a, int b) {
     int sum = a+b;
    return sum;
    }
}
