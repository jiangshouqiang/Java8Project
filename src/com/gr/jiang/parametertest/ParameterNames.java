package com.gr.jiang.parametertest;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by jiang on 2017/10/13.
 */
public class ParameterNames {
    public static void main(String [] args) throws NoSuchMethodException {
        Method method = ParameterNames.class.getMethod("main",String[].class);
        for (final Parameter parameter : method.getParameters()){
            System.out.println("Parameter : " + parameter.getName());
        }
    }
}
