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
