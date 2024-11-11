package main.java.com.thelab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ResetWindow implements ActionListener {

    JFrame resetWindow = new JFrame();
    ImageIcon logo = new ImageIcon("logo.png");

    JLabel logoLabel = new JLabel();
    JLabel emailLabel = new JLabel("E-mail Address:");
    JLabel successLabel = new JLabel("Password reset email sent!");
    JLabel errorLabel = new JLabel("Error! Email not registered.");

    JTextField emailField = new JTextField();
    JButton resetButton = new JButton("Reset Password");

    HashMap<String, String> emailInfo;

    ResetWindow(IDsAndPasswords idsAndPasswords) {
        this.emailInfo = idsAndPasswords.getEmailInfo();  // email data from registration

        resetWindow.setLayout(null); // absolute positioning

        logoLabel.setIcon(logo);
        logoLabel.setBounds(160, 10, 150, 150);
        resetWindow.add(logoLabel);

        emailLabel.setBounds(30, 180, 120, 30);
        resetWindow.add(emailLabel);
        emailField.setBounds(150, 180, 200, 30);
        resetWindow.add(emailField);

        resetButton.setBounds(150, 220, 200, 40);
        resetButton.addActionListener(this);
        resetWindow.add(resetButton);

        successLabel.setBounds(120, 270, 300, 30);
        successLabel.setForeground(Color.GREEN);
        successLabel.setVisible(false);
        resetWindow.add(successLabel);

        errorLabel.setBounds(120, 270, 300, 30);
        errorLabel.setForeground(Color.RED);
        errorLabel.setVisible(false);
        resetWindow.add(errorLabel);

        resetWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        resetWindow.setTitle("The Lab");
        resetWindow.setSize(400, 350);
        resetWindow.getContentPane().setBackground(Color.LIGHT_GRAY);
        resetWindow.setLocationRelativeTo(null);
        resetWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String emailValue = emailField.getText();

        // Check if the entered email exists in the registered emails (from emailInfo)
        if (emailInfo.containsValue(emailValue)) {
            errorLabel.setVisible(false);
            successLabel.setVisible(true);
        } else {
            successLabel.setVisible(false);
            errorLabel.setVisible(true);
        }
    }
}
