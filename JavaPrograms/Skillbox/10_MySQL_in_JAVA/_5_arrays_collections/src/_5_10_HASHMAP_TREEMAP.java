import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_10_HASHMAP_TREEMAP {
    public static void todo(){
        HashMap<String, Integer> good2count = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String goodName = scanner.nextLine();
            if (goodName.equals("LIST")){
                printMap(good2count);
                continue;
            }
            if (good2count.containsKey(goodName)){
                good2count.put(goodName, good2count.get(goodName) + 1);
            } else {
                good2count.put(goodName, 1);
            }

        }
    }

    public static void printMap(Map<String, Integer> map){
        for (String key: map.keySet()){
            System.out.println(key + " - " + map.get(key));

        }
    }
}
