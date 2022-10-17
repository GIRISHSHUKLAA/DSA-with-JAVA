public class OOP {
    public static void main(String[] args) {
        student s1 = new student();
//        System.out.println(s1.rno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);
//
        student s2 = new student(4, "dsffer", 67.08f);
//        System.out.println(s2.rno);
//        System.out.println(s2.name);
//        System.out.println(s2.marks);

//        s1.greeting();
//        s1.changeNamme("girish");
//        s1.greeting();

//        student random = new student(s1);
//        System.out.println(random.rno);
//        System.out.println(random.name);
//        System.out.println(random.marks);


        student random2 = new student(768);
        System.out.println(random2.rno);
        System.out.println(random2.name);
        System.out.println(random2.marks);

    }

}

class student {
    int rno;
    String name;
    float marks;


    void greeting() {
        System.out.println("My name is  " + name); // can also write this.name
    }

    void changeNamme(String newName) {
        name = newName;
    }

    //    we need a way to add values of above properties object by object
//    we need one word to access every object
    student() { // constructor
        this.rno = 14;
        this.name = "gns";
        this.marks = 32.09f;
    }

    student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;

        /*
         * if these variable name os same as the class than u have to use this keyword if they are different
         * than u can avoid this keyword but using this keyword is a good convection
         */
    }



    student(student other) {  // constructor that takes values from another object
        this.name = other.name; // --> internally other will replace with s1
        this.rno = other.rno;   // --> this will replace with random
        this.marks = other.marks;
    }




//    calling constructor inside a constructor
//    this is how u call constructor inside a constructor
//    internally:- new student (rno,"default person",100.0f)
    student(int rno){
        this(rno,"default person",100.0f);
    }
}
