package testQuestions;

import java.util.Scanner;

//find the minimum and maximum number in given array
public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int list [] = new int[size];
        int min  = list[0];
        int max = list[0];
        System.out.println("Enter elements of an array");
        for (int i=0;i<size;i++) {
            list[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(list[i]<min){
                min = list[i];
            }
            if(list[i]>max){
                max = list[i];
            }
        }
        System.out.println("The maximum number in the array is "+max);
        System.out.println("The minimum number in the array is "+min);
    }
}
