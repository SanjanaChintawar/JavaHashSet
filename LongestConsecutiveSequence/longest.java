
import java.util.HashSet;


public class longest {
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int max = 0;

        for(int num: set){
            if(!set.contains(num-1)){
                int curr = num;
                int length = 1;

                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }

                max = Math.max(max, length);
            }
        }

        System.out.println(max);

    }
}
