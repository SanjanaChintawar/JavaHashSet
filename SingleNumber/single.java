import java.util.HashSet;

public class single{
    public static void main(String[] args) {
        int[] nums = {4,2,1,2,1};

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                set.remove(num);
            }
            else set.add(num);
        }

        for(int num: set){
            System.out.println(num);
        }

    }
}