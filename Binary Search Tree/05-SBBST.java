import java.util.Iterator;
import java.util.TreeSet;

public class SBBST {
    public static void main(String[] args) {

//        creating an empty TreeSet
        TreeSet<String> s1 = new TreeSet<>();

//        adding item in a TreeSet
        s1.add("gap");
        s1.add("car");
        s1.add("ide");

//        Displaying TreeSet in sorted order
        System.out.println(s1);

//        Checking whether "ide" is present
//         or not
        System.out.println(s1.contains("ide"));

//        Iterator to traverse the TreeSet
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next() + " ");

        }
        System.out.println();


        TreeSet<Integer> s2 = new TreeSet<>();
        s2.add(10);
        s2.add(5);
        s2.add(2);
        s2.add(15);

        // Removing 5 from TreeSet
        s2.remove(5);

        for (Integer i2 : s2) {
            System.out.print(i2 + " ");
        }
        System.out.println();


        TreeSet<Integer> s3 = new TreeSet<>();

        s3.add(10);
        s3.add(5);
        s3.add(2);
        s3.add(15);

        // Prints the largest value lower than 5
        // Here it is 2
        System.out.println(s3.lower(5));

        // Prints the smallest higher value than 5
        // Between 10 and 15 smallest is 10
        System.out.println(s3.higher(5));

        // Value <= 5
        System.out.println(s3.floor(5));

        // Value >= 5
        System.out.println(s3.ceiling(5));
    }
}
