import java.io.*;
import java.util.*;

public class program4
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter file name : ");
        String file=sc.nextLine();

        BufferedReader br=new BufferedReader(new FileReader(file));

        int chars=0,lines=0,words=0;
        String s;

        while((s=br.readLine())!=null)
        {
            lines++;
            chars+=s.length();

            String arr[]=s.trim().split("\\s+");
            if(!(arr.length==1 && arr[0].equals("")))
                words+=arr.length;
        }

        br.close();

        System.out.println("No. of characters - "+chars);
        System.out.println("No. of lines - "+lines);
        System.out.println("No. of words - "+words);
    }
}
