package com.gr.jiang.interfacetest;

import java.util.function.Supplier;

/**
 * Created by jiang on 2017/10/13.
 */
public interface DefaulableFactory {
    static Defaulable create(Supplier<Defaulable> supplier){
        return supplier.get();
    }
}
