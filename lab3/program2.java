/* 2. Aim of the program : Illustrate the execution of constructors in multi-level  inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.
          Input: Enter the dimensions
       Output: Display the dimensions accordingly */

import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box: Height = " + height);
    }
}

class program2 extends Box {
    int thick;

    program2(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox: Thickness = " + thick);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter width: ");
        int w = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        System.out.print("Enter thickness: ");
        int t = sc.nextInt();

        new program3(l, w, h, t);
    }
}
