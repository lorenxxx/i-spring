package com.us.improve.spring.base64;

import com.alibaba.fastjson.JSON;
import org.springframework.util.Base64Utils;

import java.util.Date;

/**
 * @author liangliang
 * @date 2018/11/13 12:01 AM
 */
public class MainTest {

    public static void main(String[] args) {
        User user = new User("Loren", 27, new Date());
        String jsonUser = JSON.toJSONString(user);
        System.out.println(jsonUser);

        String base64User = Base64Utils.encodeToString(jsonUser.getBytes());
        System.out.println(base64User);

        String newJsonUser = new String(Base64Utils.decodeFromString(base64User));
        System.out.println(newJsonUser);
        User newUser = JSON.parseObject(newJsonUser, User.class);

        System.out.println(newUser);
    }

}
