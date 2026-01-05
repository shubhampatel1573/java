package sorting.bubbleSort;

public class bubbleSort {

    public static void bubbleSort(int arr[]) {

        int swap = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.print("Already sorted array");
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 1, 2, 3, 4 };
        bubbleSort(numbers);
    }
}