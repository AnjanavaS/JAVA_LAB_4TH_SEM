/* 5. Aim of the program :  Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.
Input:   Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students. Also display the name of student with lowest cgpa */

import java.util.Scanner;

class Student
{
    int roll;
    String name;
    float cgpa;
}

class program5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];
        int low = 0;

        for (int i = 0; i < n; i++)
        {
            s[i] = new Student();

            System.out.print("Enter Roll: ");
            s[i].roll = sc.nextInt();

            System.out.print("Enter Name: ");
            s[i].name = sc.next();

            System.out.print("Enter CGPA: ");
            s[i].cgpa = sc.nextFloat();

            if (s[i].cgpa < s[low].cgpa)
                low = i;
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++)
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);

        System.out.println("\nLowest CGPA Student: " + s[low].name);
    }
}
