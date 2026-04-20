import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public static void main(String[] args) {
        String[] words = {"a", "b", "a"};
        String[] words1 = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wordAppend(words));
        System.out.println(wordAppend(words1));
    }

    public static String wordAppend(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        String result ="";
        for (String s :arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
            if (map.get(s) % 2 == 0) {
                result+=s;
            }


        }
        return result;
    }
}
