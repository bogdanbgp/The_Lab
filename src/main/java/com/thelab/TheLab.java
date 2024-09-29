package main.java.com.thelab;

import javax.swing.*;
import java.awt.*;

public class TheLab extends JFrame {

    public TheLab() {
        setTitle("The Lab");

        JTextArea bottleDisplay = new JTextArea();
        bottleDisplay.setEditable(false); // make it non-editable
        bottleDisplay.setFont(new Font("Monospaced", Font.PLAIN, 14)); // set a monospaced font for ASCII art

        String bottleArt =
                        "                  ########           \n" +
                        "                   ######            \n" +
                        "                   ######            \n" +
                        "                   ######            \n" +
                        "                  ########           \n" +
                        "                 ##########          \n" +
                        "                ############         \n" +
                        "               ##############        \n" +
                        "              ################       \n" +
                        "             ##################      \n" +
                        "            ####################      \n" +
                        "           ######################     \n" +
                        "          ########################    \n" +
                        "         ###########################   \n" +
                        "        ########     THE     ########  \n" +
                        "       #########     LAB     ######### \n" +
                        "      ################################# \n" +
                        "     ###################################\n" +
                        "      ################################# \n";

        // Add the art to the text area
        bottleDisplay.setText(bottleArt);

        setLayout(new BorderLayout());
        add(bottleDisplay, BorderLayout.CENTER);
        setSize(360, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // window on center
        setVisible(true);
    }
}
