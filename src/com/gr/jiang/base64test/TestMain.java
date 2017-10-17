package com.gr.jiang.base64test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by jiang on 2017/10/16.
 */
public class TestMain {
    public static void main(String [] args){
        final String text = "Base64 Test";
        final String encode = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);

        final String decode = new String(Base64.getDecoder().decode(encode),StandardCharsets.UTF_8);
        System.out.println(decode);
    }

}
