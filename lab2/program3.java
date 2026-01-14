import java.util.Scanner;

class program3
{
    int l, w, h;

    void volume()
    {
        System.out.println("Volume = " + (l * w * h));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        program3 b = new program3();

        System.out.print("Enter length: ");
        b.l = sc.nextInt();

        System.out.print("Enter width: ");
        b.w = sc.nextInt();

        System.out.print("Enter height: ");
        b.h = sc.nextInt();

        b.volume();
    }
}
