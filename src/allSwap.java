import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public static void main(String[] args) {
        String[] words = {"ab", "ac"};
        System.out.println(wordMultiple(words));
    }
    public static String[]  wordMultiple(String [] arr ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {


                if (arr[i].charAt(0) == arr[j].charAt(0)) {


                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i = j;

                }
            }
        }
        return arr;
        }

    }

