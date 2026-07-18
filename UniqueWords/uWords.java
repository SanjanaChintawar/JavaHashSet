
import java.util.HashSet;

public class uWords {
    public static void main(String[] args){
        String sentence = "Java is fun Java is easy and powerful Learning Java with HashMap is fun because HashMap makes many problems easy. and Java Java Java helps improve programming skills.";
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        String[] words = sentence.split(" ");

        HashSet<String> set = new HashSet<>();

        for(String word : words){
            set.add(word);
        }
        for(String word : set){
            System.out.println(word);
        }

        System.out.println("Total Unique words:"+set.size());
    }
}
