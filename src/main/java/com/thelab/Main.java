package main.java.com.thelab;

public class Main {
    public static void main(String[] args) {
        IDsAndPasswords idsandpass = new IDsAndPasswords();
        LoginWindow loginwindow = new LoginWindow(idsandpass.getLoginInfo());
    }
}
