/* 1. Aim of the program -Design a GUI Calculator as shown in the attached image (GUI Picture - Calculator) using frame and action event in Java.

Input: Any two number with one operator and then click on = button.
Output: Appropriate result will be displayed. */

import java.awt.event.*;
import javax.swing.*;

public class program1 extends JFrame implements ActionListener
{
    JTextField t;
    JButton b[] = new JButton[16];
    String s[] = {"1","2","3","+","4","5","6","-","7","8","9","*","/","0","%","="};
    String num1="", num2="", op="";

    program1()
    {
        setTitle("Calculator");
        setSize(300, 350);
        setLayout(null);

        t = new JTextField();
        t.setBounds(30, 30, 220, 30);
        add(t);

        int x = 30, y = 80, k = 0;

        for(int i=0; i<4; i++)
        {
            x = 30;
            for(int j=0; j<4; j++)
            {
                b[k] = new JButton(s[k]);
                b[k].setBounds(x, y, 50, 40);
                add(b[k]);
                b[k].addActionListener(this);
                x += 60;
                k++;
            }
            y += 50;
        }

        JButton off = new JButton("OFF");
        off.setBounds(90, 290, 100, 30);
        add(off);
        off.addActionListener(e -> System.exit(0));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/") || cmd.equals("%"))
        {
            num1 = t.getText();
            op = cmd;
            t.setText("");
        }
        else if(cmd.equals("="))
        {
            num2 = t.getText();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int res = 0;

            if(op.equals("+")) res = a + b;
            else if(op.equals("-")) res = a - b;
            else if(op.equals("*")) res = a * b;
            else if(op.equals("/")) res = a / b;
            else if(op.equals("%")) res = a % b;

            t.setText(String.valueOf(res));
        }
        else
        {
            t.setText(t.getText() + cmd);
        }
    }

    public static void main(String[] args)
    {
        new program1();
    }
}