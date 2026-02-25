import java.io.*;
import java.util.*;

public class program1
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);

        int roll,marks;
        String name,sub,file;

        System.out.print("Enter Rollno : ");
        roll=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name : ");
        name=sc.nextLine();

        System.out.print("Enter Subject : ");
        sub=sc.nextLine();

        System.out.print("Enter Marks : ");
        marks=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter file name : ");
        file=sc.nextLine();

        FileWriter fw=new FileWriter(file,true);
        fw.write(roll+" "+name+" "+sub+" "+marks+"\n");
        fw.close();

        BufferedReader br=new BufferedReader(new FileReader(file));
        String line;

        System.out.println("File Content :");
        while((line=br.readLine())!=null)
            System.out.println(line);

        br.close();
    }
}
