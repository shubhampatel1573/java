public class binarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;

            } else if (key < arr[mid]) {
                end = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 };
        int key = 5;

        int res = binarySearch(num, key);
        System.out.print(num[res]);

    }
}