import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String[] arr={"a","b","c","d","e","f","g","h"};
        for(String s:arr){

        }

    }
    public static Map<String,Integer> Word0(String[] words){
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word,0);

        }
        return map;


    }
}
