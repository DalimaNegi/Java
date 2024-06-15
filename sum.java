import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        sc.close();
    }
}
