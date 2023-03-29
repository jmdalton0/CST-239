package app;

import java.util.HashMap;
import java.util.Map;

public class PlayMap {

    public static void main(String[] args) {
        System.out.println();

        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        intMap.put(1, 1);
        intMap.put(2, 2);
        intMap.put(3, 3);
        intMap.put(4, 4);
        intMap.put(5, 5);

        Map<Integer, String> stringMap = new HashMap<Integer, String>();
        stringMap.put(1, "one");
        stringMap.put(2, "two");
        stringMap.put(3, "three");
        stringMap.put(4, "four");
        stringMap.put(5, "five");

        System.out.println("intMap is size " + intMap.size());
        System.out.println("stringMap is size " + stringMap.size());

        System.out.println("intMap is empty: " + intMap.isEmpty());
        System.out.println("stringMap is empty: " + stringMap.isEmpty());

        for (Map.Entry<Integer, String> it : stringMap.entrySet()) { 
            System.out.println("stringMap element at " + it.getKey() + " is " + it.getValue());
        }

        intMap.clear();
        stringMap.clear();
    }

}
