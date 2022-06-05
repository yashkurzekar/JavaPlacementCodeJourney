package testQuestions;

import java.util.Scanner;

public class saperate0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of arrau");
        int size = sc.nextInt();
        int kinjal [] = new int[size];
        int count = 0;
        System.out.println("Enter 0 1 in array");
        System.out.println("Please do not enter other characters");
        for (int i =0;i<size;i++){
            kinjal [i]= sc.nextInt();
            if (kinjal[i]!=0 ||kinjal[i]!=1){
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        //logic
        for(int i=0;i<size;i++){// will count how many zeros are in array
            if (kinjal[i]==0){
                count++;
            }
        }

        for(int i=0;i<count;i++){
            kinjal[i]=0;
        }
        for (int i=count;i<size;i++)
        {
            kinjal[i]=1;
        }
        for (int i=0;i<size;i++){
            System.out.println(kinjal[i]+" ");
        }

    }
}
