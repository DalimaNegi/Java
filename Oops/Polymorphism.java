package Oops;
public class Polymorphism {
    public static void main(String[] args) {
        King K = new King();
        K.moves();

        Mercedes M = new Mercedes();
        M.engine();
        M.Model();
        System.out.println(M.color);

        Porche P = new Porche();
        P.engine();
        P.Model();
        System.out.println(P.color);
        
        // Animal d1 = new Deer();
        // d1.eat();

        sumCalculation calc = new sumCalculation();
        System.out.println(calc.sum(2.5f,3.9f));
        System.out.println(calc.sum(54,12,105));
    }
}
//Method Overloading
class sumCalculation{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a , float b){
        return a + b;
    }

    int sum(int a,int b,int c){
        return a + b + c;
    }
}

//Method Overriding
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Deer extends Animal{
    // void eat(){
    //     System.out.println("Eat grass");
    // }
}

//Abstract classes
abstract class Car{
    String color;
    Car(){
        color = "Black";
    }
    void engine(){
        System.out.println("Engine is working properly.");
    }
    abstract void Model(); //only gives the idea
}

class Mercedes extends Car{
    void changecolor(){
        color = "White";
    }
    void Model(){
        System.out.println("S-class");
    }
}

class Porche extends Car{
    void changecolor(){}
    void Model(){
        System.out.println("911 GT3 RS");
    }
}

//Interfaces
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal only by 1 step");
    }
}