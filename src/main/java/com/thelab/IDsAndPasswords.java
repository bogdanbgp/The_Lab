package main.java.com.thelab;

import java.util.HashMap;

public class IDsAndPasswords {

    // Store usernames and passwords
    HashMap<String, String> loginInfo = new HashMap<>();
    // Store usernames and emails
    HashMap<String, String> emailInfo = new HashMap<>();

    // Constructor initializes with some test data
    public IDsAndPasswords() {
        // sample data for login .........
        loginInfo.put("user1", "pass1");
        loginInfo.put("user2", "pass2");
        loginInfo.put("user3", "pass3");

        // emails for the users, for reset
        emailInfo.put("user1", "user1@example.com");
        emailInfo.put("user2", "user2@example.com");
        emailInfo.put("user3", "user3@example.com");
    }

    // method for registering a new user
    public void addUser(String username, String password, String email) {
        loginInfo.put(username, password);
        emailInfo.put(username, email);
    }

    // get login info (username and password)
    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }

    // get email info (username and email)
    public HashMap<String, String> getEmailInfo() {
        return emailInfo;
    }
}
