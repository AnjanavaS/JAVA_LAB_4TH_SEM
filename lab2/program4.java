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
