package Arrays1;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i=0;i<size;i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of the array is:: "+array[0]);
    }
}
