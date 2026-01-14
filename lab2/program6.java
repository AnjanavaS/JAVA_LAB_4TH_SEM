class program6
{
    void subtract(int a, int b)
    {
        System.out.println("Result = " + (a - b));
    }

    void subtract(int a, int b, int c)
    {
        System.out.println("Result = " + (a - b - c));
    }

    void subtract(double a, double b)
    {
        System.out.println("Result = " + (a - b));
    }

    public static void main(String[] args)
    {
        program6 obj = new program6();

        obj.subtract(10, 5);
        obj.subtract(20, 5, 3);
        obj.subtract(15.5, 4.5);
    }
}
