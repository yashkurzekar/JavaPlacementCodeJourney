
package javaBasic;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        System.out.println("Your age is "+a);
        System.out.println("Enter Your Name");
        sc.nextLine();//When we take any input before nextLine then it hit enter automatically and move so we use dummy sc object to get proper input
        String name = sc.nextLine();
    System.out.println("Your Name is "+ name);


    }
}
