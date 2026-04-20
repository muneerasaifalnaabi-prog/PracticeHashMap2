import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public static void main(String[] args) {

    }
    public static String[]  wordMultiple(String [] arr ) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String firstChar = String.valueOf(arr[i].charAt(0));
            if (map.containsKey(firstChar)) {
                int prev = map.get(firstChar);

                String swap = arr[prev];
                arr[prev] = arr[i];
                arr[i] = swap;
                map.remove(firstChar);


            } else {
                map.put(firstChar, i);

            }

        }
        return arr;
    }

}