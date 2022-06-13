package Arrays1;

import java.util.Scanner;

public class smallestNumberWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size  = sc.nextInt();

        int array[] = new int[size];
        System.out.println("Enter elements in the array");
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;

        for (int num:array){
            if (num<ans) ans = num;
        }
        System.out.println(ans);
    }
}
