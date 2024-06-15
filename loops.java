import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To check if a number is prime or not
        System.out.print("Enter your number to be checked: ");
        int prime = sc.nextInt();
        if (prime==2) {
            System.out.println("Tu prime hai");
        }else{
            boolean isPrime = true;
            for (int i = 2; i<=Math.sqrt(prime); i++) {
                if (prime%i==0) {
                    isPrime = false;
                }
            }

            if (isPrime==true) {
                System.out.println("Tu prime hai");
            } else{
                System.out.println("Tu imposter prime hai");
            }
        }

        // TO display all numbers entered by user except multiples of 10
        // int x ;
        // do {
        //     System.out.print("Enter number: ");
        //     x = sc.nextInt();
        //     if (x%10==0) {
        //         continue;
        //     }
        //     System.out.println("tera number tha "+x);
        // } while(x<=100);

        // To enter numbers,till user enters a multiple of 10
        do{
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if (n%10==0) {
                break;
            }
            System.out.println(n);
        } while(true);
        System.out.println("Main toh thak gaya");  

        // Print reverse of a number
        System.out.println("Enter number to be reversed ? ");
        int num = sc.nextInt();
        while (num>0) {
            int lastdigit = num%10;
            System.out.print(lastdigit +" ");
            num = num/10;
        }

        // Print square pattern
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // Print numbers from 1-10
        int i = 1;
        while (i<=10) {
            System.out.println(i + " ");
            i++;
        }

        // Print numbers from 1-n
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int j = 1;
        while (j<=n) {
            System.out.println(j);
            j++;
        }

        // Sum of first n natural numbers
        int sum = 0;
        int a = 1;
        System.out.println("Enter the number till it needs to be added.");
        int m = sc.nextInt();
        while (a<=m) {
            sum = sum +a;
            a++;
        }
        System.out.println("Sum is "+sum);
        sc.close();

    }
}
