import java.util.Scanner;

class program7
{
    int length, breadth;

    program7()          
    {
        length = 0;
        breadth = 0;
    }

    program7(int l, int b)   
    {
        length = l;
        breadth = b;
    }

    void area()
    {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        program7 r = new program7();   
        r.area();

        program7 r1 = new program7(l, b); 
        r1.area();
    }
}
