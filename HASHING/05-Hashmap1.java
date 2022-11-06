import java.util.*;

class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("covers", 20);
        System.out.println(m);
        System.out.println(m.size());
        for (Map.Entry<String,Integer>e:m.entrySet()) {
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }
}
