
public class kadansAlgorithm {
    public static void kadans(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i] < 0 ? 0 :  cs + numbers[i];
            if (cs > ms) {
                ms = cs;
            }
        }
        System.out.println("max sum : " + ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadans(numbers);
    }    
}
