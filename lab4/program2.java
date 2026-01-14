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
