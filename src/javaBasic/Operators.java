package javaBasic;

public class Operators {
    public static void main(String[] args) {
        double a = 34;
        double b = 12;
        //Arithmetic Operators
        // +, -, *, /, %
        System.out.print("% ");
        System.out.println(a % b);// modulo give us a reminder
        System.out.println("/ divide ");
        System.out.println(a/b);

        //Assignment Operators

        b += a;
        b -= a;
        b *= a;
        b /= a;
        System.out.println(b);

        //Relational Operators ==, <, >, !=, >=, <=
        int x = 2;
        int y = 3;
        boolean z = x>y;
        System.out.println(z);

        //Unary Operators
      //  a = a++; post increment
       //b = ++b;// pre increment
        System.out.println(a++);
        System.out.println(a);
        System.out.println(b);

        //bitwise Operators
        // >>, <<, ~, &, |, >>=, <<=

        int bit1 = 50;
        int bit = bit1 >>2;
        System.out.println(bit);
    }
}
