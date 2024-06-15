import java.util.*;
public class circlearea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.print("The area of circle is ");
        System.out.println(area);
        sc.close();
    }
}
