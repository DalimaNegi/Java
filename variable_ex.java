import java.util.*;
public class variable_ex {
    public static void main(String[] args) {
        
        // 1. Average of 3 numbers
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.print("The average is:");
        System.out.println(avg);
        
        // 2. areasquare
        float side = sc.nextFloat();
        float area = side*side;
        System.out.print("The area of square: "+ area);
                
        // 3. Bill of three items
        System.out.println("Enter cost of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter cost of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter cost of eraser");
        float eraser = sc.nextFloat();
        System.out.println("Your total bill is: "+pen+pencil+eraser);
        
        // To show that _ or $ is a valid identifier.
        int $ = 10;
        System.out.println($);
        sc.close();
    }
}
