package testQuestions;

import java.util.Scanner;

public class productOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        while(num != 0) {
            product = product *(num % 10); //getting last digit
            num = num/10;
        }
        System.out.println(product);
    }
}
