import java.util.Arrays;
import java.util.Collections;
public class sortingAlgo {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPosition = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition]>arr[j]){
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out correct position
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    

    public static void printArray(Integer arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {10,45,23,78,64,1,99,34};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
