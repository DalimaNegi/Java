import java.util.*;
public class product {
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product of number");
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int product = multiply(num1, num2); 
        System.out.print("Product is "+product);
        sc.close();
    }
}
