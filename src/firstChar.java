import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static void main(String[] args) {
        String[] words = {"salt", "tea", "soda", "toast"};

    }
    public static Map<String, String> firstChar(String [] arr ){
        Map<String, String> map = new HashMap<>();
        for (String s :arr){
            String key =String.valueOf(s.charAt(0));
            if (map.containsKey(key)) {

                map.put(key,map.get(key)+s);
            }
            else 
                map.put(key,s);
            

        }
        return map;

    }

}
