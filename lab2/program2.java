/* 2. Aim of the program:  Program to find no. of objects created out of a class using ‘static’ modifier.
Input:   No of objects created
Output: Display the number of objects created (e.g. no of objects=3) */

class program2
{
    static int count = 0;

    program2()  
    {
        count++;
    }

    public static void main(String[] args)
    {
        new program2();
        new program2();
        new program2();

        System.out.println("No of objects = " + count);
    }
}
