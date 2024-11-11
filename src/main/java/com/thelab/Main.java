package main.java.com.thelab;

public class Main {
    public static void main(String[] args) {
        // Create an instance of IDsAndPasswords to share login data across windows
        IDsAndPasswords idsAndPasswords = new IDsAndPasswords();

        // Create and open the LoginWindow, passing the loginInfo from IDsAndPasswords
        new LoginWindow(idsAndPasswords);
    }
}
