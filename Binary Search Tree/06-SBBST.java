import java.util.TreeMap;
import java.util.Map;


public class SBBST {
    public static void main(String[] args) {

        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> t1 = new TreeMap<>();

        // Inserting the Elements
        t1.put(10, "geeks");
        t1.put(15, "ide");
        t1.put(5, "courses");

        // Prints the TreeMap
        System.out.println(t1);

        // Check for the key in the map
        System.out.println(t1.containsKey(10));

        // Iterating over TreeMap
        for (Map.Entry<Integer, String> e : t1.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());





        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> t2 = new TreeMap<>();

        // Inserting the Elements
        t2.put(10, "geeks");
        t2.put(15, "ide");
        t2.put(5, "courses");

        // returns the smallest key greater
        // than the passed key i.e., 15
        System.out.println(t2.higherKey(10));

        // returns the greatest smaller key
        // than the passed key i.e., 5
        System.out.println(t2.lowerKey(10));

        // greatest key <= passed key i.e., 10
        System.out.println(t2.floorKey(10));

        // greatest key >= passed key i.e., 10
        System.out.println(t2.ceilingKey(10));




        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> t3 = new TreeMap<Integer, String>();

        // Inserting the Elements
        t3.put(10, "geeks");
        t3.put(15, "ide");
        t3.put(5, "courses");

        // returns the key-value pair corresponding
        // to higher key and prints the associated value
        System.out.println(t3.higherEntry(10).getValue());

        // returns the key-value pair corresponding
        // to lower key prints the associated value
        System.out.println(t3.lowerEntry(10).getValue());

        // returns a key-value mapping associated
        // with the greatest key <= to the given key
        System.out.println(t3.floorEntry(10).getValue());

        // returns a key-value mapping associated
        // with the least key >= to the given key
        System.out.println(t3.ceilingEntry(10).getValue());
    }
}
