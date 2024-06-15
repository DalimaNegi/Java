public class Bit_manipulation {

  public static void OddorEven(int n){
    int bitMask = 1;
    if ((n & bitMask)==0) {
      System.out.println(n+" is an even number");
    }else{
      System.out.println(n+" is an odd number");
    }
  }

  public static int getIthBit(int n,int i){
      int bitMask = 1<<i;
      if ((n & bitMask)==0) {
        return 0;
      }else{
        return 1;
      }
  }

  public static int setIthBit(int n, int i){
    int bitMask = 1<<i;
    return n|bitMask;
  }

  public static int clearIthBit (int n,int i ){
    int bitMask = ~(1<<i);
    return (n & bitMask);
  }

  public static int updateIthBit(int n, int i, int newBit){
    n = clearIthBit(n,i);
    int bitMask = newBit<<i;
    return (n|bitMask);
  }

  public static int clearIBits(int n, int i){
    int bitMask = (~0)<<i;
    return n&bitMask;
  }

  public static int clearRangeOfBits(int n, int i, int j){
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a|b;
    return n&bitMask;
  }

  public static boolean isPowerTwo(int n){
    return (n&(n-1)) == 0;
    //n = 16 = 10000
    //n-1 = 15 = 01111
    // 10000 & 01111 = 0
  }

  public static int countSetBits(int n){
    int count = 0;
    while (n>0) {
      if ((n&1) != 0) { //check LSB
        count++;
      }
      n= n>>1;
    }
    return count;
  }

  //Fast exponentiation  
  public static int fastExpo(int a , int n){
    int ans = 1;
    while(n>0){
      if((n&1) != 0){
        ans = ans * a;
      }
      a = a*a;
      n = n>>1;
    }
    return ans;
  }

  //Modular Exponentiation
      public static void main(String[] args) {
        //Binary AND
        System.out.println(5&6);
        
        //Binary OR
        System.out.println(5|6);
        
        //Binary XOR
        System.out.println(5^6);
        
        //Binary one's complement
        System.out.println(~0);
        //complement of a +ve number is -ve because while complementing, the MSB gets changed so instead we takeout the 2's complement which makes the number -ve.

        //Binary left shift
        System.out.println(5<<2);

        //Binary right shift
        System.out.println(6>>1);

        //To find odd or even.
        OddorEven(3);
        OddorEven(14);

        //get bit
        System.out.println(getIthBit(9, 3));

        //set Bit
        System.out.println(setIthBit(10, 2));

        //clear Bit
        System.out.println(clearIthBit(10, 1));

        //update Bit
        System.out.println(updateIthBit(10, 2 , 1));

        //clear i bits
        System.out.println(clearIBits(15, 2));

        //clear range of bits
        System.out.println(clearRangeOfBits(10, 2, 4));

        System.out.println(isPowerTwo(32));

        System.out.println(countSetBits(16));
        System.out.println(countSetBits(15));

        System.out.println(fastExpo(5, 3));

      }
}
