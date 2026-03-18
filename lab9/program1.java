/* 1. Aim of the program - Write a java program which will accept students details like Student RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in a file. Again open the file, read the content and display all.
Input: Enter student details -   Rollno, name, subject, marks
           Enter the name of existing file to which student details will be written.
Output: Display the content of existing file */

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
