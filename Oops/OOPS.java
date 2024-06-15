package Oops;

public class OOPS {
    public static void func(int b){
        System.out.println(b);
    }
    public static void main(String[] vari) {
        // func(5);
        Fish tuna = new Fish();
        tuna.eat();
        // tuna.birth = "how birth"; {it raises an error bcoz its value has already been fixed.}


        Student s1 = new Student();
        s1.studentname = "Katherine";
        s1.roll = 41222130;
        s1.password = "Hello@123";
        // System.out.println(s1.studentname);
        Student s2 = new Student(s1); //copy
        s2.password = "6789ola";

        Pen cello = new Pen(); //created a pen object - cello
        cello.setColor("pink");
        // System.out.println(cello.getColor());

        cello.setTip(2);
        // System.out.println(cello.getTip());

        BankAccount user1 = new BankAccount();
        user1.name = "Dalima";
        // user1.password = "abc"; This will throw an error as it was a private class.
        user1.setPassword("ABC123");
    }
}

class BankAccount{
    public String name;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }

    String getColor(){
        return this.color;
    }

    void setTip(int newtip){
        tip = newtip;
    }

    int getTip(){
        return this.tip;
    }
}

class Student{
    String studentname;
    int roll;
    String password;

    //copy constructor
    //shallow copy
    Student(Student s1){
        this.studentname = s1.studentname;
        this.roll = s1.roll;
        this.password = s1.password;
    }

    Student(String name){ //parameterized constructor
        this.studentname = name;
    }
    Student(){
        System.out.println("constructor is called.......");
    }
}

//Inheritance 
class Animal{ //Base class
    String color;
    Animal(){
        System.out.println("animal constructor is called....");
    }
    void eat(){
        System.out.println("This animal eats");
    }
    void breathe(){
        System.out.println("saans bhi leta hai");
    }
}
class Fish extends Animal{ //subclass or derived class
    final String birth = "Lays only eggs";
    int fins;
    void swim(){
        super.eat();
        System.out.println("Ye swim krta h");
    }
}
