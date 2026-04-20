import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static void main(String[] args) {

    }
    public static Map<String, Integer> firstChar(String [] arr ){
        Map<String, String> map = new HashMap<>();
        for (String s :arr){
            String key =String.valueOf(s.charAt(0));
            if (map.containsKey(key)) {

                map.put(key,map.get(key)+s);
            }

        }

    }

}
