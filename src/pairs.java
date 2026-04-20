import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String[] arr ={"code", "bug"};
        System.out.println(pairs(arr));

    }
    public static Map<String, String> pairs(String []arr){
        Map<String, String> map = new HashMap<>();
        for (String s:arr){
            char key =s.charAt(0);
            char value =s.charAt(s.length()-1);
            map.put(String.valueOf(key),String.valueOf(value));

        }
        return map;



    }
}
