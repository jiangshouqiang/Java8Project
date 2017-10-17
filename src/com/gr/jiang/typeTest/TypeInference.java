package com.gr.jiang.typeTest;

/**
 * Created by jiang on 2017/10/13.
 */
public class TypeInference {
    public static void main(String[] args){
        final Value<String> value = new Value<>();
        System.out.println(value.getOrDefault("work",Value.defaultValue()));
    }
}
