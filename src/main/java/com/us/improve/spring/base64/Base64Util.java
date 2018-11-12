package com.us.improve.spring.base64;

import com.alibaba.fastjson.JSON;
import org.springframework.util.Base64Utils;

/**
 * @author liangliang
 * @date 2018/11/13 12:29 AM
 */
public class Base64Util {

    public static <T> String encodeObjectToString(T t) {
        return Base64Utils.encodeToString(JSON.toJSONString(t).getBytes());
    }

    public static <T> T decodeObjectFromString(String str, Class<T> tClass) {
        return JSON.parseObject(new String(Base64Utils.decodeFromString(str)), tClass);
    }

}
