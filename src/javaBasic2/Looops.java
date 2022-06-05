package javaBasic2;

public class Looops {
    public static void main(String[] args) {
        //for loop
        for (int i=1;i<=10;i++){
            System.out.println("Yash" +i);
        }

        //nasted for loop
        int n=8;
        for(int j= 1;j<=n;j++){
            for (int k=1;k<=j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //whilw
        int index=1;
        while (index<=5){
            System.out.println("Yash while"+index);
            index++;
        }
        // do while
        int a=1;
        do {
            System.out.println("Hello yash Do while loop");
            a++;
        } while (a<=2);
    }
}
