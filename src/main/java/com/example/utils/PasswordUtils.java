package com.example.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.util.ByteSource;

import java.security.MessageDigest;

@Slf4j
public class PasswordUtils {


    public static String getEncodePwd(String pwd, String saltOri) {
        try {
            ByteSource salt = ByteSource.Util.bytes(saltOri);
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            byte[] md5Str = md5.digest(pwd.getBytes());
            return new String(Base64.encode(sha1.digest((pwd + new String(Base64.encode(md5Str)) + salt).getBytes())));
        } catch (Exception e) {
            log.info("hash失败", e);
            return "";
        }
    }
}
