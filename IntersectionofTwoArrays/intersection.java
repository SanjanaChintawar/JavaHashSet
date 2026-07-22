
import java.util.HashSet;

public class intersection {
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int a : nums1){
            set1.add(a);
        }
        
        for(int a : nums2){
            if(set1.contains(a)){
                result.add(a);
            }
        }

        System.out.println(result);

    }
}
