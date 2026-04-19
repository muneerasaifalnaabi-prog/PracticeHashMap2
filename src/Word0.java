import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String[] arr={"a","b","c","d","e","f","g","h"};
        String[] arr1={"a","b"};
        System.out.println(word0(arr));
        System.out.println(word0(arr1));
        }


    public static Map<String,Integer> word0(String[] words){
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word,0);

        }
        return map;


    }
}
