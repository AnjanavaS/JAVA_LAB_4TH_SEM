/* 2. Aim of the program -Write a GUI program in Java with three Labels – Enter the First Number, Enter the Second Number, Result, and three text fields for  - first number, second number and result and four buttons - Add, Sub, multiply and reset as shown below. On clicking of any of these buttons, the corresponding operation should be performed with input1 and input2 and the result should be displayed in the result box.
 
Input: First and second number
Output: Appropriate result will be displayed in the result text field
(Refer GUI picture 1) */

import java.awt.event.*;
import javax.swing.*;

public class program2 extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    program2()
    {
        setTitle("My Calc");
        setSize(500, 300);
        setLayout(null);

        l1 = new JLabel("Enter the First Number:");
        l1.setBounds(50, 50, 180, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(230, 50, 100, 30);
        add(t1);

        l2 = new JLabel("Enter the Second Number:");
        l2.setBounds(50, 90, 180, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(230, 90, 100, 30);
        add(t2);

        l3 = new JLabel("Result:");
        l3.setBounds(50, 130, 180, 30);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(230, 130, 100, 30);
        add(t3);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Reset");

        b1.setBounds(350, 50, 100, 30);
        b2.setBounds(350, 90, 100, 30);
        b3.setBounds(350, 130, 100, 30);
        b4.setBounds(200, 180, 100, 30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            if(e.getSource() == b1)
                t3.setText(String.valueOf(a + b));
            else if(e.getSource() == b2)
                t3.setText(String.valueOf(a - b));
            else if(e.getSource() == b3)
                t3.setText(String.valueOf(a * b));
            else if(e.getSource() == b4)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        }
        catch(Exception ex)
        {
            t3.setText("Invalid Input");
        }
    }

    public static void main(String[] args)
    {
        new program2();
    }
}