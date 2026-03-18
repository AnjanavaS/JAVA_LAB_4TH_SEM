/* 3. Design a class University that contains an inner class Department. University has fields: universityName, location ;Department has fields: deptName, hodName ;

The inner class should access and display the outer class data.

Create an object of the inner class from the outer class. */

class program3 {

    String universityName = "KIIT University";
    String location = "Bhubaneswar";

    class Department {
        String deptName = "Computer Science";
        String hodName = "Biswajeet Sahoo";

        void display() {
          
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    public static void main(String[] args) {
        program3 u = new program3();           
        program3.Department d = u.new Department(); 
        d.display();
    }
}
