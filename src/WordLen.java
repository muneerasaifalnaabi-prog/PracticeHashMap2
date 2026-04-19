import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = {"hello","hello","hello","hello","hello","hello"};
        System.out.println(wordLen(words));


    }
    public static Map<String, Integer> wordLen(String []arr){
        Map<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            map.put(word,word.length());

        }
        return map;

    }


}
