package com.gr.jiang.nulltest;

import java.util.Optional;

/**
 * Created by jiang on 2017/10/16.
 */
public class OptionalTest {
    public static void main(String [] args){
        Optional<String> fullName = Optional.ofNullable("TOM");
        System.out.println("Full Name is set ? "+fullName.isPresent());
        System.out.println("Full Name : " + fullName.orElseGet(()->"[none]"));
        System.out.println(fullName.map(s->"Hey " + s + "!").orElse("Hey Stranger!"));
    }
}
