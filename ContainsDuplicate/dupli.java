import java.util.HashSet;

public class dupli{
    public static void main(String[] args){
        int[] arr = {1,2,1,3,4,2,5,3};

        HashSet<Integer> set = new HashSet<>();

        for(int a: arr){
            if(set.contains(a)){
                System.out.println("Duplicate elemnt: "+a);
            }
            else {
                set.add(a);
            }
        }
    }
} 