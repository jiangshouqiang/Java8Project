package com.gr.jiang.interfacetest;

/**
 * Created by jiang on 2017/10/11.
 */
public interface Defaulable {
    void test();
    default String notRequest(){
        return "Default implementation";
    }
}

class TestInface2 implements Defaulable{

    @Override
    public void test() {

    }
}