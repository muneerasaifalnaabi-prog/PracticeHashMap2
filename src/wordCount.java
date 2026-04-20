import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(words));

    }
    public static Map<String, Integer> wordCount(String []arr){
        Map<String, Integer> map = new HashMap<>();
        for(String str : arr){
            if (map.containsKey(str)) {
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        return map;

        }

    }

