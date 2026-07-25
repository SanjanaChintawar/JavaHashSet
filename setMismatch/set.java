import java.util.HashSet;

public class set{
    public static void main(String[] args) {
        int[] nums = {1,1};
        
        HashSet<Integer> set = new HashSet<>();
        int[] miss = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                miss[0] = nums[i];
            }
            set.add(nums[i]);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                miss[1] = i;
            }
        }

        System.out.print(miss[0]);
        System.out.print(miss[1]);
    }
}