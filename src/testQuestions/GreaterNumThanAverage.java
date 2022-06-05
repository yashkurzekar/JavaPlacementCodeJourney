package testQuestions;

import java.util.Scanner;

public class GreaterNumThanAverage {
    //Java program to find the numbers greater than the avarage of the numbers of a given array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = sc.nextInt();
        int arr [] = new int[(size)];
        double sum = 0d;
        System.out.println("Enter elements in array ");
        for (int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        double avg = sum/size;
        System.out.println("The average of array is "+avg);
        System.out.println("The numbers grater than average are following ");

        for (int j=0;j<size;j++) {
            if (arr[j]>avg) {
                System.out.println(arr[j]);
            }
        }
    }
}
