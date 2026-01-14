class Student {
    int rollno;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

  
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return rollno == s.rollno && name.equals(s.name);
    }
}

public class program3 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Abhinav");
        Student s2 = new Student(101, "Abhinav");

        if (s1.equals(s2))
            System.out.println("Both students are equal");
        else
            System.out.println("Both students are not equal");
    }
}
