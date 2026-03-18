/* 1. Aim of the program - Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4 */

class program1 {
    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
