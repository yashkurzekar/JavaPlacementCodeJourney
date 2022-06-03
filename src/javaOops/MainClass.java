package javaOops;
class Animal {
    int legs;
    String Name;

    void walk() {//function
        System.out.println(Name + " Can walk");
    }

    void walk(int steps) {//function with same name method overlading
        System.out.println(" method overloading is working here");
    }

    public Animal() {//default constructor
        System.out.println("Default Constructor");
    }

    public Animal(String newName) {// constructor overriding
        System.out.println(newName + " is parameterised constructor");
    }
}
public class MainClass {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal("Shriya");

        a1.legs= 2;
        a1.Name="Parrot";
        a2.legs = 4;
        a2.Name = "Cow";

        System.out.println(a1.legs);
        System.out.println(a1.Name);
        a1.walk();
        System.out.println();
        System.out.println(a2.legs);
        System.out.println(a2.Name);
        a2.walk();
        a2.walk(4);
    }


}
