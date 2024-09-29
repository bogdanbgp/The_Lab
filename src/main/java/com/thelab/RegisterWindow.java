package main.java.com.thelab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterWindow implements ActionListener {

    JFrame regWindow = new JFrame();
    ImageIcon logo = new ImageIcon("logo.png");

    JLabel logoLabel = new JLabel();
    JLabel titleLabel = new JLabel("Create an account");
    JLabel usernameLabel = new JLabel("Username:");
    JLabel emailLabel = new JLabel("E-mail address:");
    JLabel passLabel = new JLabel("Password:");
    JButton registerButton = new JButton("Register");
    JLabel validCredsLabel = new JLabel("Registration complete!");
    JLabel invalidCredsLabel = new JLabel("Please try again!");
    JTextField usernameField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField passField = new JPasswordField();

    RegisterWindow() {
        regWindow.setLayout(null); // absolute positioning

        logoLabel.setIcon(logo);
        logoLabel.setBounds(120, 10, 150, 150);
        regWindow.add(logoLabel);

        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(130, 160, 200, 30);
        regWindow.add(titleLabel);

        usernameLabel.setBounds(30, 200, 100, 30);
        regWindow.add(usernameLabel);
        usernameField.setBounds(130, 200, 200, 30);
        regWindow.add(usernameField);

        emailLabel.setBounds(30, 240, 100, 30);
        regWindow.add(emailLabel);
        emailField.setBounds(130, 240, 200, 30);
        regWindow.add(emailField);

        passLabel.setBounds(30, 280, 100, 30);
        regWindow.add(passLabel);
        passField.setBounds(130, 280, 200, 30);
        regWindow.add(passField);

        registerButton.setBounds(150, 320, 150, 40);
        registerButton.addActionListener(this);
        regWindow.add(registerButton);

        validCredsLabel.setBounds(160, 370, 300, 30);
        validCredsLabel.setForeground(Color.GREEN);
        validCredsLabel.setVisible(false);
        regWindow.add(validCredsLabel);

        invalidCredsLabel.setBounds(174, 370, 300, 30);
        invalidCredsLabel.setForeground(Color.RED);
        invalidCredsLabel.setVisible(false);
        regWindow.add(invalidCredsLabel);

        regWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        regWindow.setTitle("The Lab");
        regWindow.setSize(400, 500); // Set the desired size
        regWindow.getContentPane().setBackground(Color.LIGHT_GRAY);
        regWindow.setLocationRelativeTo(null); // Center the window
        regWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userValue = usernameField.getText();
        String emailValue = emailField.getText();

        if (!userValue.contains("+") && !userValue.contains("[") &&
                !userValue.contains("|") && !userValue.contains("]") &&
                !userValue.contains("\\") && !userValue.contains("{") &&
                !userValue.contains(":") && !userValue.contains("}") &&
                !userValue.contains("<") && !userValue.contains("?") &&
                !userValue.contains(">") && !userValue.contains("/") &&
                !userValue.contains("'") && !userValue.contains("\"") &&
                !userValue.contains(",") && !userValue.contains(";") &&
                emailValue.contains("@") && (emailValue.contains(".com") ||
                emailValue.contains(".ro") || emailValue.contains(".org") ||
                emailValue.contains(".co.uk") || emailValue.contains(".net"))) {
            invalidCredsLabel.setVisible(false);
            validCredsLabel.setVisible(true);
        } else {
            validCredsLabel.setVisible(false);
            invalidCredsLabel.setVisible(true);
        }
    }
}
