
import java.util.HashSet;
import java.util.Scanner;

public class remDupli {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int a: arr){
            set.add(a);
        }
        System.out.println("Array after removing duplicates");
        System.out.println(set);
    }
}
