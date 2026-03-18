/* 4. Aim of the program -Design a GUI application which consists of three Label named as Red, Green and blue, three combo boxes which will consist the value from 0 to 255 and one button named as show output. The user will select different values from three combo boxes. When the user clicks on the button, the panel background will be changed accordingly as per the value passed in RGB format.
 
Input: select three color value(0-255) from 3 different combo box.
Output: The panel color will be changed accordingly
(Refer GUI picture 3) */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class program4 extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JComboBox<Integer> cb1, cb2, cb3;
    JButton btn;
    JPanel panel;

    program4()
    {
        setTitle("My Frame");
        setSize(500, 300);
        setLayout(null);

        panel = new JPanel();
        panel.setBounds(0, 0, 500, 300);
        panel.setLayout(null);
        add(panel);

        Integer values[] = new Integer[256];
        for(int i = 0; i < 256; i++)
            values[i] = i;

        l1 = new JLabel("Red");
        l1.setBounds(50, 20, 50, 30);
        l1.setForeground(Color.RED);
        panel.add(l1);

        cb1 = new JComboBox<>(values);
        cb1.setBounds(100, 20, 60, 30);
        panel.add(cb1);

        l2 = new JLabel("Blue");
        l2.setBounds(180, 20, 50, 30);
        l2.setForeground(Color.BLUE);
        panel.add(l2);

        cb2 = new JComboBox<>(values);
        cb2.setBounds(230, 20, 60, 30);
        panel.add(cb2);

        l3 = new JLabel("Green");
        l3.setBounds(310, 20, 50, 30);
        l3.setForeground(Color.GREEN);
        panel.add(l3);

        cb3 = new JComboBox<>(values);
        cb3.setBounds(370, 20, 60, 30);
        panel.add(cb3);

        btn = new JButton("Show Output");
        btn.setBounds(200, 70, 120, 30);
        panel.add(btn);

        btn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int r = (int) cb1.getSelectedItem();
        int b = (int) cb2.getSelectedItem();
        int g = (int) cb3.getSelectedItem();

        panel.setBackground(new Color(r, g, b));
    }

    public static void main(String[] args)
    {
        new program4();
    }
}