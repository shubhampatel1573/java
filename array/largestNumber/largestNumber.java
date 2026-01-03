import java.util.*;
public class largestNumber{
    public static int largestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (largest < arr[i]) {
                largest = arr[i];
            } 
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 100, 50};
        int num = largestNumber(arr);
        System.out.print(num);
    }
}