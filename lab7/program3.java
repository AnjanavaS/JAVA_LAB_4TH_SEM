import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

class program3 {

    void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        program3 obj = new program3();

        try {
            int n = sc.nextInt();
            obj.ProcessInput(n);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
