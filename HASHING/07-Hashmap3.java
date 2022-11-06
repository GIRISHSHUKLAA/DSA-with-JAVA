// Java program to illustrate 
// Java.util.HashMap 

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Create an empty hash map 
        HashMap<String, Integer> m = new HashMap<>();

        // Add elements to the map 
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Check for a Value
        if (m.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Get value corresponding to passed key
        // <"ide", 15>
        System.out.println(m.get("ide"));

        // The given key is absent
        System.out.println(m.get("practice"));

    }
} 

