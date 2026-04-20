import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args) {

    }
    public static Map<String, Boolean> firstChar(String [] arr ){
        Map<String, Integer> map = new HashMap<>();

        for (String s:arr){
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
            if (map.get(s)>=2){
                return true;
            }
        }



    }
}
