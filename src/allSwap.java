import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public static void main(String[] args) {
        String[] words = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] result =allSwap(words);
        for (String s:result){
            System.out.println(s);
        }
    }
    public static String[] allSwap(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String firstChar = arr[i].substring(0, 1);

            if (map.containsKey(firstChar)) {
                int index = map.get(firstChar);

                String temp = arr[i];
                arr[i] = arr[index];
                arr[index]= temp;

                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return arr;
    }

}

