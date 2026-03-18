/* 4.  Aim of the program :  Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, calculate and display to read the values of length and breadth,  calculate the area and perimeter of the rectangle and display the result   respectively.
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length
and breadth of the rectangle.
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length
and breadth of the rectangle.
    Input:   Mention length and breadth 
Output: Display Area of Rectangle and Perimeter of rectangle. */

import java.util.Scanner;

class program4
{
    int length, breadth, area, perimeter;

    program4(int l, int b)
    {
        length = l;
        breadth = b;
    }

    void calculate()
    {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display()
    {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        program4 r = new program4(l, b);
        r.calculate();
        r.display();
    }
}
