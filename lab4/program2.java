/* 2. Illustrate the usage of abstract class with following Java classes –
l  An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract method course()
l A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object.
 
          Input - Rollno - 2205180
Registration no - 1234567890
          Output -Rollno - 2205180
Registration no - 1234567890
Course - B.Tech. (Computer Science & Engg) */

abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long rg) {
        rollno = r;
        regno = rg;
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class program2 {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();

        k.getinput(2205180, 1234567890L);

        System.out.println("Rollno - " + k.rollno);
        System.out.println("Registration no - " + k.regno);
        k.course();
    }
}
