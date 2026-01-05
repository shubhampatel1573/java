// cover two question subarray & MAX sum of subarray
public class subArray{

    public static void subArray(int numbers[]){
        int ts = 0;
        int MAX_SUM = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                int currSum = 0;
                for(int k = start ; k<=end; k++){
                    System.out.print(numbers[k] );
                    currSum = currSum+numbers[k];
                }
                ts++;
                System.out.println();
                if (MAX_SUM < currSum) {
                    MAX_SUM = currSum;
                }
                System.out.println("----" + currSum + "----" );
            }
            System.out.println("____________________");
        }
        System.out.println("Total Number of subarray : " + ts);
        System.out.println("MAX SUM :" + MAX_SUM);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        // for max sum 
        int numbers1[] = {1, -2, 6, -1, 3};
        subArray(numbers1);;
    }
}