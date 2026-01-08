import java.util.*;
public class Matrices{

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key not found\n");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        //Total number of rows
        int n = matrix.length;
        //Total number of columns
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        search(matrix, 15);
        
        //OUTPUT
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}