package javaOops;

import java.util.Scanner;

//Write sun of values of array.
public class sumOfValuesOfArrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter a size of array");
        int size = sc.nextInt();
        int sum = 0;
        int arr1[] = new int[size];
        System.out.println("Enter elements in array");
        for(int i=0;i<size;i++){
            arr1[i]= sc.nextInt();
        }
        for(int j=0;j<size;j++) {
            sum += arr1[j];
        }
        System.out.println("The sum of array is "+sum);

    }
}
