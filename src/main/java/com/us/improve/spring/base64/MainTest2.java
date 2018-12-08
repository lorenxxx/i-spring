package com.us.improve.spring.base64;

import java.util.Date;

/**
 * @author liangliang
 * @date 2018/11/13 12:29 AM
 */
public class MainTest2 {

    public static void main(String[] args) {
        User user = new User("Loren", 27, new Date());
        String base64User = Base64Util.encodeObjectToString(user);
        System.out.println(base64User);

        User newUser = Base64Util.decodeObjectFromString(base64User, User.class);
        System.out.println(newUser);
    }

}
