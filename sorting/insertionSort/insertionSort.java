package sorting.insertionSort;
import java.util.*;
public class insertionSort {
    public static void insertionSort(Integer arr[]){
    for(int i = 1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        while (prev>=0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
        }
       // insertion
       arr[prev+1] = curr;
        }
    }

    public static void printArr(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
public static void  main(String args[]){
    Integer arr[] = {5, 4, 1, 3, 2};
    // insertionSort(arr);
    Arrays.sort(arr, Collections.reverseOrder());
    printArr(arr);
}
}

