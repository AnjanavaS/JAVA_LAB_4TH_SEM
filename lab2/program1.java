/* 1. Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
Input: Enter 10 number from keyboard
Output:  Display number of even and odd number */

class program1
{
    public static void main(String[] args)
    {
        int even = 0, odd = 0;

        for (int i = 0; i < 10; i++)
        {
            int n = Integer.parseInt(args[i]);
            if (n % 2 == 0) even++;
            else odd++;
        }

            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers : " + odd);
    }
}
