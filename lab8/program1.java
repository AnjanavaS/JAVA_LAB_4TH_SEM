/* Aim of the program -Write a program to perform following operations on user entered strings and a character –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
v) Convert the string to upper case and lower case
vi) Check whether the character is present in the string and at which position
vii) Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string
 
 
Input:        Enter a String    :  amit
Output: The string after changing the case is AMIT
The string after reversing is  tima
 
 Input: Enter the second string for comparision : kumar
Output: The difference between ASCII value is 10
 
Input: Enter the string to be inserted into first string : thakur
Output: The string after insertion is : amit thakur
 
 
Input:    Enter a String : Amit
Output: Uppercase: AMIT
                 Lowercase: amit
 
Input: Enter a String :Amitkumar
          Enter a character : m
Output:  Position of entered character: 2
 
Input: Enter a String : Amitkumar
          Enter a character : Y
Output: Entered character is not present
 
Input: Enter a String :  madam
Output: Entered string is palindrome
 
Input: Enter a String : muscle
Output: Entered string is not a palindrome
 
Input: Enter a String :    Ram is going to school
Output: No. of words: 5
           No. of vowels: 7
          No. of consonants: 11 */

import java.util.*;

public class program1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String str1,str2,temp="";
        int i;

        System.out.print("Enter a String : ");
        str1=sc.nextLine();

        for(i=0;i<str1.length();i++)
        {
            char c=str1.charAt(i);
            if(Character.isLowerCase(c))
                temp+=Character.toUpperCase(c);
            else
                temp+=Character.toLowerCase(c);
        }
        System.out.println("The string after changing case is "+temp);

        temp="";
        for(i=str1.length()-1;i>=0;i--)
            temp+=str1.charAt(i);

        System.out.println("Reversed string : "+temp);

        System.out.print("Enter second string for comparison : ");
        str2=sc.nextLine();
        int diff=Math.abs(str1.compareTo(str2));
        System.out.println("ASCII difference : "+diff);

        System.out.print("Enter string to insert : ");
        String ins=sc.nextLine();
        System.out.println("After insertion : "+str1+" "+ins);

        System.out.println("Uppercase : "+str1.toUpperCase());
        System.out.println("Lowercase : "+str1.toLowerCase());

        System.out.print("Enter character to search : ");
        char ch=sc.next().charAt(0);
        int pos=str1.indexOf(ch);

        if(pos>=0)
            System.out.println("Position : "+pos);
        else
            System.out.println("Character not present");

        sc.nextLine();

        String rev="";
        for(i=str1.length()-1;i>=0;i--)
            rev+=str1.charAt(i);

        if(str1.equalsIgnoreCase(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("Not palindrome");

        int words=0,v=0,c=0;
        String s=str1.toLowerCase();

        for(i=0;i<s.length();i++)
        {
            char x=s.charAt(i);

            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
                v++;
            else if(Character.isLetter(x))
                c++;
        }

        String arr[]=s.trim().split("\\s+");
        words=arr.length;

        System.out.println("Words : "+words);
        System.out.println("Vowels : "+v);
        System.out.println("Consonants : "+c);
    }
}
