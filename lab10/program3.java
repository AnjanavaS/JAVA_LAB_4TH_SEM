/*  3. Aim of the program -Implement a GUI application which consists of one List Box and one button. The list box will have four different color names. When the user will select a color from the list box and click on the button, the panel color will be changed to that color.
 
Input: Select any color from the list box
Output: Panel background color will be changed accordingly
 (Refer GUI picture 2)*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class program3 extends JFrame implements ActionListener
{
    JList<String> list;
    JButton btn;
    JPanel panel;

    program3()
    {
        setTitle("My frame");
        setSize(400, 300);
        setLayout(null);

        panel = new JPanel();
        panel.setBounds(0, 0, 400, 300);
        panel.setLayout(null);
        add(panel);

        String colors[] = {"white", "orange", "red", "blue"};
        list = new JList<>(colors);
        list.setBounds(150, 40, 100, 80);
        panel.add(list);

        btn = new JButton("Click");
        btn.setBounds(260, 60, 80, 30);
        panel.add(btn);

        btn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String selected = list.getSelectedValue();

        if(selected != null)
        {
            if(selected.equals("white"))
                panel.setBackground(Color.white);
            else if(selected.equals("orange"))
                panel.setBackground(Color.orange);
            else if(selected.equals("red"))
                panel.setBackground(Color.red);
            else if(selected.equals("blue"))
                panel.setBackground(Color.blue);
        }
    }

    public static void main(String[] args)
    {
        new program3();
    }
}