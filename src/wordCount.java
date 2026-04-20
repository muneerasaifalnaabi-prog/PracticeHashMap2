import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = {"a", "bb", "a", "bb"};
        sout

    }
    public static Map<String, Integer> pairs(String []arr){
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
