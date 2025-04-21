package main.java.com.thelab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginWindow extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon logo = new ImageIcon("logo.png");

    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset password");
    JButton registerButton = new JButton("Register");

    JLabel usernameLabel = new JLabel("Username:");
    JLabel passLabel = new JLabel("Password:");
    JLabel registerLabel = new JLabel("Not a member?");
    JLabel logoLabel = new JLabel();
    JLabel validCredsLabel = new JLabel("Login Successful!");
    JLabel invalidCredsLabel = new JLabel("Invalid username or password");

    JTextField usernameField = new JTextField();
    JPasswordField passField = new JPasswordField();

    //  idsAndPasswords instance
    private IDsAndPasswords idsAndPasswords;

    // constructor
    LoginWindow(IDsAndPasswords idsAndPasswords) {
        this.idsAndPasswords = idsAndPasswords;  // Store the passed instance

        HashMap<String, String> loginInfo = idsAndPasswords.getLoginInfo();  // login data get

        frame.setLayout(null);

        logoLabel.setBounds(162, -10, 150, 150);
        logoLabel.setIcon(logo);

        usernameLabel.setBounds(36, 130, 75, 25);
        passLabel.setBounds(40, 160, 75, 25);
        registerLabel.setBounds(162, 330, 120, 20);

        usernameField.setBounds(105, 130, 230, 25);
        passField.setBounds(105, 160, 230, 25);

        loginButton.setBounds(152, 194, 120, 45);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        loginButton.setBackground(Color.RED);

        resetButton.setBounds(120, 275, 180, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        registerButton.setBounds(150, 355, 120, 20);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);

        validCredsLabel.setBounds(158, 245, 180, 25);
        validCredsLabel.setForeground(Color.GREEN);
        validCredsLabel.setVisible(false);

        invalidCredsLabel.setBounds(116, 245, 200, 25);
        invalidCredsLabel.setForeground(Color.RED);
        invalidCredsLabel.setVisible(false);

        frame.add(logoLabel);
        frame.add(loginButton);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(usernameField);
        frame.add(passField);
        frame.add(usernameLabel);
        frame.add(passLabel);
        frame.add(registerLabel);
        frame.add(validCredsLabel);
        frame.add(invalidCredsLabel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setTitle("The Lab");
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        HashMap<String, String> loginInfo = idsAndPasswords.getLoginInfo();

        if (e.getSource() == loginButton) {
            String enteredUsername = usernameField.getText();
            String enteredPassword = new String(passField.getPassword());

            validCredsLabel.setVisible(false);
            invalidCredsLabel.setVisible(false);

            if (loginInfo.containsKey(enteredUsername) && loginInfo.get(enteredUsername).equals(enteredPassword)) {
                validCredsLabel.setVisible(true);
                // if login is successful, proceed to the main app
                new TheLab(); // open TheLab window
            } else {
                invalidCredsLabel.setVisible(true);
            }
        }

        if (e.getSource() == resetButton) {
            usernameField.setText("");
            passField.setText("");
            new ResetWindow(idsAndPasswords); // Pass idsAndPasswords to ResetWindow
        }

        if (e.getSource() == registerButton) {
            usernameField.setText("");
            passField.setText("");
            new RegisterWindow(idsAndPasswords); // Pass idsAndPasswords to RegisterWindow
        }
    }
}