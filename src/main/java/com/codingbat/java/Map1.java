package Task;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<String, String>();
        Map<String, String> secondtestMap = new HashMap<String, String>();

        testMap.put("a", "Adam");
        testMap.put("b", "Beata");
        testMap.put("c", "Celina");
        secondtestMap.put("c", "Celina");


        System.out.println(testMap);
        System.out.println(secondtestMap);

        System.out.println(mapBully(testMap));
        System.out.println(mapShare(testMap));

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.remove("c");
            return map;
        } else {
            map.remove("c");
            return map;
        }
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", (map.get("a") + map.get("b")));
            return map;
        } else return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) map.put("ice cream", "cherry");
        map.put("bread", "butter");
        return map;
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
        if (map.containsKey("spinach")) map.put("spinach", "nuts");
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) map.put("fries", map.get("potato"));
        if (map.containsKey("salad")) map.put("spinach", map.get("salad"));
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) map.put("b", map.get("a"));
        else if (map.containsKey("b") && !map.containsKey("a")) map.put("a", map.get("b"));
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()) map.put("c", map.get("a"));
            else if (map.get("b").length() > map.get("a").length()) map.put("c", map.get("b"));
            else if (map.get("b").length() == map.get("a").length()) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }


}
