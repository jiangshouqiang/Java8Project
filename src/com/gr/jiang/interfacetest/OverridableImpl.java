package com.gr.jiang.interfacetest;

/**
 * Created by jiang on 2017/10/11.
 */
public class OverridableImpl implements Defaulable {
    @Override
    public void test() {

    }

    @Override
    public String notRequest() {
        return "Overridden implementation";
    }
}
