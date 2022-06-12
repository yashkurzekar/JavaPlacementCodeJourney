package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class snallestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        int value = 0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0;i<size;i++){
            for (int j=i+1;j<=size;j++){
                if (arr[i] > arr[j]) {
                    value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                }
            }

        }
        System.out.println("Smallest element is "+arr[0]);
        System.out.println("Thank You");
    }
}
