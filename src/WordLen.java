import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {

    }
    public static Map<String, Integer> wordLen(String []arr){
        Map<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            map.put(word,word.length());

        }

    }


}
