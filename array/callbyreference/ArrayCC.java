package array.callbyreference;
import java.util.*;

public class ArrayCC{
 public  static void printArray(int arr[]){
        for(int i = 0; i<3; i++){
            System.out.println(arr[i]);
        }
        arr[0] = 100;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age[] = new int[50];

        for(int i = 0; i<3; i++){
            age[i] = sc.nextInt();
        }

        printArray(age);
        System.out.println(age[0]);;
    }
}