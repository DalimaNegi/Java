import java.util.*;
public class Functions {
    // Java always works on call by value and not call by reference.
    public static int binomialcoefficient(int n, int r){
        int num_fact= factorial(n);
        int r_fact= factorial(r);
        int nr_fact = factorial(n-r);
        int bincoeff = num_fact/(r_fact*nr_fact);
        return bincoeff;
    }
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <=num; i++) {
            fact =fact*i;
        }
        return fact;
    }

    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First number is:" + num1);
        System.out.println("Second number is:" + num2);
    }

    // public static boolean isPrime(int prime){
    //     boolean isPrime = true;
    //     if (prime==2) {
    //         return true;
    //     }
    //     for (int i = 2; i <=prime-1; i++) {
    //         if (prime%i==0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int prime){
        if (prime==2) {
            return true;
        }
        for (int i = 2; i <=Math.sqrt(prime); i++) {
            if (prime%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimesInRange(int n){
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        PrimesInRange(100);

        System.out.println("Enter the number to know wheather it is prime or not ?");
        int prime = sc.nextInt();
        System.out.println(isPrime(prime));

        System.out.println("Numbers after swapping :");
        swap(7,3);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int results = factorial(num);
        System.out.println("The factorial is "+ results);

        System.out.println("Enter the values of n and r:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = binomialcoefficient(n, r);
        System.out.println("The binomial coefficient is  " + result);
        
    sc.close();
    }
}
