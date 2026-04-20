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
        int counter = 0;
        int index = 0;
        for (String s : arr) {
            String firstChar = s.substring(0, 1);
            if (map.containsKey(firstChar)) {
                index = map.get(firstChar);
                String temp = arr[counter];
                arr[counter] = arr[index];
                arr[index] = temp;
                map.remove(firstChar);
            } else {
                map.put(firstChar, counter);
            }

            counter = counter + 1;
        }
        return arr;
    }

}

