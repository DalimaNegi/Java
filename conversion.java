public class conversion {
    public static void b2d(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum=0;
        while (binNum>0) {
            int lastdigit = binNum%10;
            decNum = decNum + (lastdigit* (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum );
    }

    public static void d2b(int decNum){
        int myNum = decNum;
        int pow =0;
        int binNum =0;
        while (decNum>0) {
            int rem = decNum%2;
            binNum = binNum+(rem * (int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("Decimal of " +myNum+ " = " + binNum);
    
    }
    public static void main(String[] args) {
        // b2d(10101);
        d2b(7);
    }
}
