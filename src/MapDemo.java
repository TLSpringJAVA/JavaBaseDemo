import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){
        Map<String,String> petMap = new HashMap<String, String>();
        petMap.put("cat","Kiddy");
        petMap.put("my dog","dog");

        System.out.print(petMap.containsKey("cat"));

    }
}
