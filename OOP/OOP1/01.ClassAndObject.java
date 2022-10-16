import java.util.Arrays;

public class OOP {
    public static void main(String[] args) {
        student[] s = new student[5]; // Array of class student
        System.out.println(Arrays.toString(s)); // default value

        student s1; // declaring reference variable  of class student
        s1 = new student(); // new keyword:- it actually dynamically allots
//      Dynamically allots means it allocates the memory during run time and returns a reference to it
//      In java all class objects must be dynamically allocated
        System.out.println(s1); // default value of s1
        System.out.println("Before Assigning Values");
        System.out.println(s1.rno);  // since they are primitives so it will print default value
        System.out.println(s1.name); // since they are primitives so it will print default value
        System.out.println(s1.marks);// since they are primitives so it will print default value

//        now we are assigning values
        s1.rno = 14;
        s1.name = "gns";
        s1.marks = 32.09f;
        System.out.println("After Assigning Values");
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);


    }

}

class student { // creating class
    //    for every student
    int rno;
    String name;
    float marks;

}
