/* 1. Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
Input: Enter  dimensions
Output:  Display the cost of plastic */

import java.util.Scanner;

class Plastic2D
{
    double length, width;

    void cost2D()
    {
        System.out.println("Cost of 2D Sheet = Rs " + (length * width * 40));
    }
}

class program1 extends Plastic2D
{
    double height;

    void cost3D()
    {
        System.out.println("Cost of 3D Box = Rs " + (length * width * height * 60));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        program1 p = new program1();

        System.out.print("Enter length: ");
        p.length = sc.nextDouble();

        System.out.print("Enter width: ");
        p.width = sc.nextDouble();

        System.out.print("Enter height: ");
        p.height = sc.nextDouble();

        p.cost2D();
        p.cost3D();
    }
}
