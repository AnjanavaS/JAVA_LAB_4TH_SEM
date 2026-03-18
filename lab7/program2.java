/* 2. Aim of the program-  Write a Java program to handle an ArithmeticException using try, catch, and finally block.
Input: Operand values for division operation mentioned in the program
Output: ArithmeticException caught by try-catch-finally block */

class program2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
