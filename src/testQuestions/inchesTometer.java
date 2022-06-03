package testQuestions;

import java.util.Scanner;

public class inchesTometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inch ");
        float inch = sc.nextFloat();
        float meter = inch * 0.0254f;
        System.out.println(inch+" inches in meter is "+meter);
    }
}
