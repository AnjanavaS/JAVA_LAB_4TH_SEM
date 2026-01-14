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
