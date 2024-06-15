public class patterns {
    public static void main(String[] args) {
        // Character pattern
        char ch = 'A';
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        // Inverted star pattern
        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        // Star pattern
        for (int i = 1; i<=5 ; i++) {
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
