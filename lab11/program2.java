/* 2. Aim of the program -Design a GUI application as shown in the attached image ( GUI Picture - String) which consists of two text fields and various buttons for String operations. On clicking any of the button, the corresponding operation will be performed on the entered string in the first text field and the resultant string will be displayed in the second text field.
Input: Any string in the fist text field and  click on any button.

Output: Modified string in the second field */

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class program2 extends JFrame implements ActionListener
{
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    program2()
    {
        setTitle("My Frame");
        setSize(700, 400);
        setLayout(null);

        l1 = new JLabel("Enter the string:");
        l1.setBounds(50, 50, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(200, 50, 300, 30);
        add(t1);

        l2 = new JLabel("String in upper case:");
        l2.setBounds(50, 100, 200, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(250, 100, 250, 30);
        add(t2);

        b1 = new JButton("IN CAPS");
        b2 = new JButton("IN SMALL");
        b3 = new JButton("CONVERT CASE");
        b4 = new JButton("WORDS");
        b5 = new JButton("LETTERS");
        b6 = new JButton("REVERSE");
        b7 = new JButton("VOWELS");
        b8 = new JButton("FREQUENCY");
        b9 = new JButton("BEGIN CAPS");
        b10 = new JButton("RESET");

        b1.setBounds(30, 200, 120, 30);
        b2.setBounds(160, 200, 120, 30);
        b3.setBounds(290, 200, 150, 30);
        b4.setBounds(450, 200, 100, 30);
        b5.setBounds(560, 200, 100, 30);

        b6.setBounds(100, 240, 120, 30);
        b7.setBounds(230, 240, 120, 30);
        b8.setBounds(360, 240, 150, 30);
        b9.setBounds(520, 240, 120, 30);

        b10.setBounds(300, 300, 120, 30);

        add(b1); add(b2); add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8); add(b9); add(b10);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = t1.getText();

        if(e.getSource() == b1)
            t2.setText(s.toUpperCase());

        else if(e.getSource() == b2)
            t2.setText(s.toLowerCase());

        else if(e.getSource() == b3)
        {
            String res="";
            for(char c : s.toCharArray())
            {
                if(Character.isUpperCase(c))
                    res += Character.toLowerCase(c);
                else
                    res += Character.toUpperCase(c);
            }
            t2.setText(res);
        }

        else if(e.getSource() == b4)
        {
            String words[] = s.trim().split("\\s+");
            t2.setText("Words: " + words.length);
        }

        else if(e.getSource() == b5)
        {
            t2.setText("Letters: " + s.length());
        }

        else if(e.getSource() == b6)
        {
            String rev = new StringBuilder(s).reverse().toString();
            t2.setText(rev);
        }

        else if(e.getSource() == b7)
        {
            int count=0;
            for(char c : s.toLowerCase().toCharArray())
            {
                if("aeiou".indexOf(c) != -1)
                    count++;
            }
            t2.setText("Vowels: " + count);
        }

        else if(e.getSource() == b8)
        {
            Map<Character,Integer> map = new HashMap<>();
            for(char c : s.toCharArray())
            {
                if(c!=' ')
                    map.put(c, map.getOrDefault(c,0)+1);
            }
            t2.setText(map.toString());
        }

        else if(e.getSource() == b9)
        {
            String words[] = s.split(" ");
            String res="";
            for(String w : words)
            {
                if(w.length()>0)
                    res += Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + " ";
            }
            t2.setText(res.trim());
        }

        else if(e.getSource() == b10)
        {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args)
    {
        new program2();
    }
}