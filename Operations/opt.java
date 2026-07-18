import java.util.HashSet;

public class opt{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>(); // creation

        // adding values
        set.add(101);
        set.add(102);
        set.add(103);
        set.add(101);
        set.add(104);
        set.add(105);

        // hashset ignores deuplicate values

        // traversing
        for(int num: set){
            System.out.println(num);
        }
        // contains in O(1)
        System.out.println("Dose set contain 102: "+ set.contains(102));

        // size 
        System.out.println("Size of set: "+ set.size());

        // remove
        set.remove(103);

        // is empty?
        System.out.println("Is it empty: "+ set.isEmpty());

        


    }
}