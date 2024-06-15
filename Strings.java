import java.util.*;
public class Strings {
    public static String substring(String str,int si, int ei){
        String substr = "";
        for (int i =si; i<=ei; i++) {
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static double getpath(String path){
        int x=0 , y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir=='S') {
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if (dir=='E') {
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return Math.sqrt(x2+y2);
    }
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i)==str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
   
    public static void Letters(String fullName){
        for (int i = 0; i < fullName.length(); i++) {
           System.out.print(fullName.charAt(i)+" "); 
        }
    }

    // To convert first letter of each word to uppercase.
    public static String uppercase(String letter){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(letter.charAt(0));
        sb.append(ch);
        for (int i = 1; i < letter.length(); i++) {
            if (letter.charAt(i)==' '&& i<letter.length()-1) {
                sb.append(letter.charAt(i));
                i++;
                sb.append(Character.toUpperCase(letter.charAt(i)));
            }else{
                sb.append(letter.charAt(i));
            }
        }
        return sb.toString();
    }

    // String compression
    public static String compression(String c){
        String newc = " ";
        for (int i = 0; i < c.length(); i++) {
            Integer count = 1;
            while (i<c.length()-1 && c.charAt(i)==c.charAt(i+1)) {
                count++;
                i++;
            }
            newc += c.charAt(i);
            if (count>1) {
                newc += count.toString();
            }
        }
        return newc;
    }
    public static void main(String[] args) {
        System.out.println(compression("aaaabbbcdddd"));

        String letter = "hi, iam dalima";
        // System.out.println(letter.toUpperCase(h));
        System.out.println(uppercase(letter));

        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());


        // Dexicographic comaprison
        String fruits[]={"Mango","Guava","Grapes"};
        String largest = fruits[0];
        for (int index = 0; index < fruits.length; index++) {
            if (largest.compareTo(fruits[index])>0) {
                largest=fruits[index];
            }
        }
        System.out.println(largest);


        // Substring
        // System.out.println(substring("Racecarsdotcom", 3, 9));
        String stri = "Netflix and prime";
        System.out.println(stri.substring(1,15));



        String s1 = "Dalima";
        // String s2 = "Dalima";
        String s3 = new String("Dalima");
        // if (s1==s2) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // if (s1==s3) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Stringsz are not equal");
        // }
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Stringsz are not equal");
        }
        System.out.println(getpath("WNN"));
        
        // char arr[] = {'a','b','c','d'};
        String str1 = "Dalima";
        String str2 = new String("Negi");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("My name is "+name);
        // System.out.println("The length of name is "+ name.length());
        String str = "Neon";
        if (isPalindrome(str)) {
            System.out.println(str+" is not a palindrome.");
        }else{
            System.out.println(str+" is a palindrome.");
        }

        // System.out.println("Concatenation");
        String fullName = str1+" "+str2;
        Letters(fullName);
        // System.out.println(fullName.charAt(7));
        
        sc.close();
    }
}