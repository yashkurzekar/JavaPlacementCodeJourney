package testQuestions;

import java.util.Scanner;

public class areaAndParameterOfCircle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius = sc.nextFloat();
        System.out.println("Please select what you want to calculate");
        System.out.println("1: Area of circle ");
        System.out.println("2:Parameter of circle");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                float area = (radius * 2) * 3.14f;
                System.out.println("Area of circle is " + area);
            }
            case 2 -> {
                float parameter = (3.14f * 2) * radius;
                System.out.println("Parameter of circle is " + parameter);
            }
            default -> System.out.println("Please enter valid input");
        }

    }
}
