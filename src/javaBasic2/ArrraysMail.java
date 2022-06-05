package javaBasic2;

import java.util.Scanner;

public class ArrraysMail {
    public static void main(String[] args) {
        int[] ageList = new int[5];
//        ageList[0] = 12;
//        ageList[1] = 21;
//        ageList[2] = 24;
//        ageList[3] = 25;
//        ageList[4] = 26;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter a age of roll number "+(i+1));
            ageList[i] = sc.nextInt();
        }
//        for (int j=0;j<5;j++){
//            System.out.println("Age of Roll no "+(j+1)+" is "+ageList[j]);
//        }
        // for each loop, where we need to print or iterate in whole Array
        for (int element: ageList){
            System.out.println(element);
        }

    }
}
