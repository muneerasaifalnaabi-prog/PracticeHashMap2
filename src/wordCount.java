import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(words));

    }
    public static Map<String, Integer> wordCount(String []arr){
        Map<String, Integer> map = new HashMap<>();
        int count =0;
        for (int i =0;i< arr.length;i++){
           if(map.containsKey(arr[i])){
               count=map.get(arr[i])+1;
               map.put(arr[i],count);
           }
        }
        return map;

    }
}
