
import java.util.HashSet;

public class hNum {

    public static void main(String[] args) {
        int num = 19;
        HashSet<Integer> set = new HashSet<>();

        while (num != 1) {

            if (set.contains(num)) {
                System.out.println("Not a Happy number");
                break;
            }
            set.add(num);
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                num = num / 10;
                sum += digit*digit;
            }
            num = sum;

        }
        if(num == 1) System.out.println("Happy number");
        
    }
}
