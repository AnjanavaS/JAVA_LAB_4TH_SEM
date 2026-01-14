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
