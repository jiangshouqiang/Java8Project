package com.gr.jiang.typeTest;

/**
 * Created by jiang on 2017/10/13.
 */
public class Value<T> {
    public static<T> T defaultValue(){
        return null;
    }
    public T getOrDefault(T value,T defaultValue){
        return (value != null)?value:defaultValue;
    }
}
