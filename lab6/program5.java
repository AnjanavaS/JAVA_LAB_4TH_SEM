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
