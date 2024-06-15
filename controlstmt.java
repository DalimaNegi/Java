import java.util.*;
public class controlstmt {
    public static void main(String[] args) {
            // if-else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are adult.");
        }
        else if (age>=13 && age<=18) {
            System.out.println("You're a teenager");
        }
        else{
            System.out.println("You're a kiddo.");
        }

        // even-odd
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("This number is even.");
        } else{
            System.out.println("This number is odd.");
        }

        // Income tax calculator
        System.out.println("Enter your income:");
        int income = sc.nextInt();
        int tax = 0;
        if (income<500000) {
            System.out.println("No tax to be filled.");
        }
        else if (income>=500000 && income<1000000) {
            tax = (int) (income*0.2);
        }
        else{
            tax = (int) (income*0.3);
        }
        System.out.println("Tax to be filled:" + tax);

        // Print largest of three numbers
        int a = 34;
        int b = 68;
        int c = 10;
        if (a>=b && a>=c) {
            System.out.println("A is largest.");
        }
        else if (b>=c) {
            System.out.println("B is largest.");
        } else{
            System.out.println("C is largest.");
        }

        // Ternary operator
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        String result = (marks>=33)? "PASS":"FAIL";
        System.out.println("You are "+ result);

        sc.close();
    }
}
