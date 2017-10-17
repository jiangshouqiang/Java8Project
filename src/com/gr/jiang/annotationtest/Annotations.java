package com.gr.jiang.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by jiang on 2017/10/13.
 */
public class Annotations {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_PARAMETER,ElementType.TYPE_USE})
    public @interface NonEmpty{
    }

    public static class Holder<@Annotations.NonEmpty T> extends @Annotations.NonEmpty Object{
        public void method() throws @NonEmpty Exception{

        }
    }

    public static void main(String[] args){
        final Holder<String> holder = new @NonEmpty Holder<String>();
        @NonEmpty Collection<@NonEmpty String> strings = new ArrayList<>();
    }
}
