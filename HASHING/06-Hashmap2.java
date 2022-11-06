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

        // Check for a key
        if (m.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        m.remove("ide");
        System.out.println(m.size());
    }
} 
