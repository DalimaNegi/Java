import java.util.*;
public class Arrays {

    // TO make pairs in an array
    public static void pairs(int list[]) {
        int tp =0;
         for (int i = 0; i < list.length; i++) {
            int curr = list[i];
            for(int j=i+1; j<list.length; j++){
                System.out.print("("+curr+","+list[j]+")");
                tp++;
            }
            System.out.println();
         }
         System.out.println("Total pairs: "+tp); // Formulae: (n(n-1))/2
        
    }

    // To reverse an array
    public static void reverse(int list[]){
        int first = 0 , last = list.length-1;
        while (first<last) {
            int temp = list[first];
            list[first]=list[last];
            list[last]=temp;
            first++;
            last--;
        }
        //here time complexity will be 0(n) but space complexity will be constant.
    }

    // Binary serach in a sorted array
    public static int binarysearch(int list[],int key){
        int start = 0,end=list.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (list[mid]==key) {
                return mid;
            }
            if (list[mid]<key) { //right side
                start = mid+1;
            }
            else{
                end = mid-1; //left side
            }
        }
        return -1;
    }

    // Find largest number in an array
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i]>largest) {
                largest = number[i];
            }
            if (number[i]<smallest) {
                smallest = number[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
        return largest;
    }

    public static void update(int number[]){
        for (int i = 0; i < number.length; i++) {
            number[i]=number[i]+1;
        }
    }

    // Linear search in an array
    public static int linearsearch(String menu[], String key){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("BINARY SEARCH");
        int list[]={2,4,8,12,16,32,64,128,256,512,1024};
        pairs(list);
        
        reverse(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
        }
System.out.println();
        int key = 128;
        System.out.println("Index for key is  "+ binarysearch(list, key));
        
        
        int number[]={50,45,99,198,256,1};
        int largest = getlargest(number);
        System.out.println("The largest number is: "+largest);

        update(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]+" ");
        }
        
        Scanner sc = new Scanner(System.in);
        // String menu[] ={"chaap","momos","chole bhature","lassi","roll","burger"};
        // System.out.println("Enter item:");
        // String key = sc.nextLine();
        // int index = linearsearch(menu, key);
        // if (index==-1) {
        //     System.out.println("Not found");
        // }
        // else{
        //     System.out.println("Key is at index "+ index);
        // }

        // int marks[] = new int[5];
    // int years[] = {2020,2019,2024};
    // String fruits[] = {"Apple","Mango","Guava"};
    
    // marks[0]=sc.nextInt();
    // marks[1]=sc.nextInt();
    // marks[2]=sc.nextInt();
    // System.out.println("Phy: "+ marks[0]);
    // System.out.println("Chemistry: "+ marks[1]);
    // System.out.println("Maths: "+ marks[2]);
    // marks[2]= marks[2]+1;
    // System.out.println("Maths: "+ marks[2]);

    // int percentage = (marks[0]+marks[1]+marks[2])/3;
    // System.out.println("percentage: "+ percentage + "%");

    // System.out.println("Length of marks array is: "+ marks.length);
    sc.close();
    }
}
