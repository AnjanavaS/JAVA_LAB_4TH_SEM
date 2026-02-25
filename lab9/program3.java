import java.io.*;

public class program3
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream f1=new FileInputStream("file1.dat");
        FileInputStream f2=new FileInputStream("file2.dat");

        int b1,b2,pos=1,flag=0;

        while(true)
        {
            b1=f1.read();
            b2=f2.read();

            if(b1==-1 && b2==-1)
                break;

            if(b1!=b2)
            {
                flag=1;
                System.out.println("Two files are not equal: byte position at which two files differ is "+pos);
                break;
            }

            pos++;
        }

        if(flag==0)
            System.out.println("Two files are equal");

        f1.close();
        f2.close();
    }
}
