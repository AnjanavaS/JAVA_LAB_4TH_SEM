/* 2. Aim of the program - Write a program in Java to copy the content of a given file to another user entered file using character stream (using File Reader and FileWriter Classes)  and byte Stream (using FileInputStream and FileOutputStream Class).
Input: Enter the source file name -  sourcefile.txt  (Assume Input file exists in the system)
  Enter the destination file name -   destinationfile.txt
      Output: File Copied*/

import java.io.*;
import java.util.*;

public class program2
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);

        String src,dest;
        int ch;

        System.out.print("Enter source file name : ");
        src=sc.nextLine();

        System.out.print("Enter destination file name : ");
        dest=sc.nextLine();

        FileReader fr=new FileReader(src);
        FileWriter fw=new FileWriter(dest);

        while((ch=fr.read())!=-1)
            fw.write(ch);

        fr.close();
        fw.close();

        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dest,true);

        while((ch=fis.read())!=-1)
            fos.write(ch);

        fis.close();
        fos.close();

        System.out.println("File Copied");
    }
}
