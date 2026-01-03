import java.util.*;

public class ArrayCC{
   static void printArray(int arr[]){
        for(int i = 0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age[] = new int[50];

        for(int i = 0; i<10; i++){
            age[i] = sc.nextInt();
        }

        printArray(age);

        String name[] = {"shubham", "shivam", "khushi"};
        System.out.println(name);
    }
}