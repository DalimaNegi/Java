import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void swap(ArrayList<Integer> obj,int i1, int i2){
        int temp = obj.get(i1);
        obj.set(i1, obj.get(i2));
        obj.set(i2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(3);
        obj.add(6);
        obj.add(7);
        obj.add(9);
        obj.add(2);
        obj.add(4, 32); 

        // System.out.println("Size of Array List is "+obj.size());

        //to print arrayList
        for (int i = 0; i <obj.size() ; i++) {
            // System.out.println(obj.get(i));
        }

        //to print it's reverse- O(n)
        for (int i = obj.size()-1; i>=0; i--) {
            // System.out.print(obj.get(i)+" ");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < obj.size(); i++) {
            if(obj.get(i)> max){
                max = obj.get(i);
            }
        }
        // System.out.println("Maximum element is: "+ max);

        int i1 = 2, i2 = 4;
        // System.out.println("Before: "+obj);
        swap(obj, i1, i2);
        // System.out.println("After: "+obj);

        Collections.sort(obj);
        // System.out.println("Sorting: "+obj);
        Collections.sort(obj, Collections.reverseOrder());
        // System.out.println("Desc Sorting"+obj);

        //Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2); list2.add(4);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3); list3.add(6);
        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println("MainList: "+ mainList);


        
        //to insert an element
        // System.out.println(obj);
        // System.out.println(obj.get(2));
        // obj.remove(4);
        // System.out.println(obj);
        // obj.set(1, 10);
        // System.out.println(obj);
        // System.out.println(obj.contains(11));

    }
}
