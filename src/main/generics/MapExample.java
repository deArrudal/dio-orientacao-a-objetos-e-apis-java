package main.generics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map defaultMap = new HashMap();
        defaultMap.put("Key 1", 10);
        defaultMap.put("Key 2", "value");

        for (Object object : defaultMap.entrySet()) {
            Map.Entry entry = (Map.Entry) object;
            String key = entry.getKey().toString();
            Object value = entry.getValue();
            System.out.println("Key : value => " + key + " : " + value);
        }

        // using generic types.
        Map<String, Integer> genericMap = new HashMap<>();
        genericMap.put("Key 1", 10);
        genericMap.put("Key 2", 20);

        for (Map.Entry<String, Integer> entry : genericMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key : value => " + key + " : " + value);
        }
    }
}
