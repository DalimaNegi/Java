import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Output is "+ (a+b));
                                    break;
            case '-': System.out.println("Output is "+ (a-b));
                                    break;
            case '*': System.out.println("Output is "+ (a*b));
                                    break;
            case '/': System.out.println("Output is "+ (a/b));
                                    break;
            case '%': System.out.println("Output is "+ (a%b));
                                    break;
            default: System.out.println("My calculator is not much advanced.");
        }
       sc.close();
    }
}
