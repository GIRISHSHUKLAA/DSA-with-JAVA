// Java program to demonstrate
// working of HashSet

import java.util.*;

class hashing {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();


        h.add("gfg");
        h.add("courses");
        h.add("ide");


        System.out.println(h);


        System.out.println(h.contains("ide"));


        for (String s : h) {
            System.out.print(s + " ");
        }


    }
}
