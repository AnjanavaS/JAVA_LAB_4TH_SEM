interface Motor {
    int capacity = 2000;

    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Motor is consuming " + capacity + " watts of power.");
    }
}

public class program1 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + Motor.capacity + " watts.");
        wm.run();
        wm.consume();
    }
}
