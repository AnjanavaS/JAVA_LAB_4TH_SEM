/* 5. Create an interface Greeting with a method sayHello()
Implement the interface using an 

anonymous inner class

Display a custom greeting message */

interface Greeting {
    void sayHello();
}

class program5 {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello! Welcome to Java Programming");
            }
        };
        g.sayHello();
    }
}
