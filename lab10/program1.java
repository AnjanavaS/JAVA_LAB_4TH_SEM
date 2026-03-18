/* 1. Aim of the program -Design a registration form using Swing with following components on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image. */

import java.awt.event.*;
import javax.swing.*;

public class program1 extends JFrame implements ActionListener
{
    JLabel nameLabel, genderLabel, hobbyLabel, addressLabel, imageLabel;
    JTextField nameField;
    JTextArea addressArea;
    JCheckBox cb1, cb2, cb3;
    JRadioButton r1, r2;
    JButton submit;
    ButtonGroup bg;

    program1()
    {
        setTitle("Registration Form");
        setSize(400, 500);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);
        add(nameField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 100, 100, 30);
        add(genderLabel);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r1.setBounds(150, 100, 70, 30);
        r2.setBounds(220, 100, 80, 30);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(r1);
        add(r2);

        hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(50, 150, 100, 30);
        add(hobbyLabel);

        cb1 = new JCheckBox("Reading");
        cb2 = new JCheckBox("Gaming");
        cb3 = new JCheckBox("Sports");

        cb1.setBounds(150, 150, 100, 30);
        cb2.setBounds(150, 180, 100, 30);
        cb3.setBounds(150, 210, 100, 30);

        add(cb1);
        add(cb2);
        add(cb3);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 250, 100, 30);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setBounds(150, 250, 150, 60);
        add(addressArea);

        ImageIcon img = new ImageIcon("image.jpg");
        imageLabel = new JLabel(img);
        imageLabel.setBounds(50, 320, 100, 100);
        add(imageLabel);

        submit = new JButton("Submit");
        submit.setBounds(150, 350, 100, 30);
        add(submit);

        submit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String name = nameField.getText();
        String gender = "";

        if(r1.isSelected())
            gender = "Male";
        else if(r2.isSelected())
            gender = "Female";

        String hobbies = "";
        if(cb1.isSelected()) hobbies += "Reading ";
        if(cb2.isSelected()) hobbies += "Gaming ";
        if(cb3.isSelected()) hobbies += "Sports ";

        String address = addressArea.getText();

        JOptionPane.showMessageDialog(this,
                "Name: " + name +
                "\nGender: " + gender +
                "\nHobbies: " + hobbies +
                "\nAddress: " + address);
    }

    public static void main(String[] args)
    {
        new program1();
    }
}