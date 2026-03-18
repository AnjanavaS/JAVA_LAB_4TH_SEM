/* 4. Aim of the program : Program to check a user entered number is palindrome or not 
Input:  Mention the number in the program
Output: display the number is Palindrome or not. */

class program4 {
    public static void main(String[] args) {
        int num = 121;  
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (rev == original)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");
    }
}