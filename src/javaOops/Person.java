package javaOops;

class person1 {
    static int count;
    String name;
    int age;

    void walking (person1 obj){
        System.out.println(name+" is walking");
        age+=10;

    }
    public person1(){
        this("Shrawasti",21);
        count++;
        System.out.println("Person is being created");
    }
//    public person1(String sName, int sage)
//    {
//        name = sName;
//        age = sage;
//    }
    public person1(String name,int age){
        //this(); will call default constructor
        this.name = name;//use this to remove confusion
        this.age = age;
        walking(this);
    }
}
public class Person {
    public static void main(String[] args) {
        person1 p1 = new person1();
        person1 p2 = new person1();
        person1 p3 = new person1("Yash",24);
        person1 p4 = new person1();

        System.out.println(p1.count);
        System.out.println(p3.name);
    }
}
