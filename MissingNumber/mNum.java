
import java.util.HashSet;

public class mNum {
    public static void main(String[] args) {
        int[] arr ={9,6,4,2,3,5,7,0,1,11};
        
        HashSet<Integer> set = new HashSet<>();

        for(int a: arr){
            set.add(a);
        }

        for(int i = 0; i < arr.length+1; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
