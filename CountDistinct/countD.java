
import java.util.HashSet;

public class countD {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,1,4,5,2,4};

        HashSet<Integer> set = new HashSet<>();

        for(int a: arr){
            set.add(a);
        }
        System.out.println("Count of Distinct Elements: "+ set.size());
    }
}
