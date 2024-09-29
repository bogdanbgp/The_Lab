package main.java.com.thelab;

import java.util.HashMap;

public class IDsAndPasswords {

    HashMap<String,String> loginInfo = new HashMap<>();

    IDsAndPasswords() {
        // key, value (user, pass)
        loginInfo.put("user1", "pass1");
        loginInfo.put("user2", "pass2");
        loginInfo.put("user3", "pass3");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
