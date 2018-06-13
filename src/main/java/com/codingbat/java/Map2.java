package Task;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        Map<String, String> secondTestMap = new HashMap<>();

        String [] ssdsds = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String [] ss = allSwap(ssdsds);
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            result.put(s, 0);
        }
        return result;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            result.put(s, s.length());
        }
        return result;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String s : strings) {
            result.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return result;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String s : strings) {
            if (result.containsKey(s)) {
                Integer countChar = result.get(s);
                result.replace(s, ++countChar);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }

    public Map<String, String> firstChar(String[] strings) {
        HashMap<String, String> result = new HashMap<>();
        for (String s : strings) {
            if (result.containsKey(s.substring(0, 1))) {
                String sum = result.get(s.substring(0, 1));
                result.replace(s.substring(0, 1), (sum + s));
            } else {
                result.put(s.substring(0, 1), s);
            }
        }
        return result;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                if (map.get(s) == false) {
                    map.replace(s, true);
                }
            } else {
                map.put(s, false);
            }
        }
        return map;
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                // swap
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;

                // delete
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

}
