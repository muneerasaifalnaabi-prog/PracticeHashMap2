import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(words));

    }
    public static Map<String, Boolean> wordMultiple(String [] arr ){
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> map1 = new HashMap<>();

        for (String s:arr){
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }

        }
        for (String r:map.keySet()){
            map1.put(r, map.get(r) >= 2);

        }
        return map1;

    }
}
