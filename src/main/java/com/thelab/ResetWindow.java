package main.java.com.thelab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetWindow implements ActionListener {

    JFrame resetWindow = new JFrame();
    ImageIcon logo = new ImageIcon("logo.png");

    JLabel logoLabel = new JLabel();
    JLabel emailLabel = new JLabel("E-mail Address:");
    JLabel successLabel = new JLabel("Password reset email sent!");
    JLabel errorLabel = new JLabel("Error! Please try again.");

    JTextField emailField = new JTextField();
    JButton resetButton = new JButton("Reset Password");



    ResetWindow() {
        resetWindow.setLayout(null); // Use absolute positioning

        logoLabel.setIcon(logo);
        logoLabel.setBounds(120, 10, 150, 150);
        resetWindow.add(logoLabel);

        emailLabel.setBounds(30, 180, 100, 30);
        resetWindow.add(emailLabel);
        emailField.setBounds(150, 180, 200, 30);
        resetWindow.add(emailField);

        resetButton.setBounds(150, 220, 200, 40);
        resetButton.addActionListener(this);
        resetWindow.add(resetButton);

        successLabel.setBounds(50, 270, 300, 30);
        successLabel.setVisible(false);
        resetWindow.add(successLabel);

        errorLabel.setBounds(50, 270, 300, 30);
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

        if (emailValue.contains("@") && (emailValue.contains(".com") ||
                emailValue.contains(".ro") || emailValue.contains(".org") ||
                emailValue.contains(".co.uk") || emailValue.contains(".net"))) {
            errorLabel.setVisible(false);
            successLabel.setVisible(true);
        } else {
            successLabel.setVisible(false);
            errorLabel.setVisible(true);
        }
    }
}
