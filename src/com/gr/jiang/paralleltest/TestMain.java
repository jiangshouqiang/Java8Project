package com.gr.jiang.paralleltest;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jiang on 2017/10/16.
 */
public class TestMain {
    public static void main(String [] args){
        long[] arrayOfLong = new long[2000];

        Arrays.parallelSetAll(arrayOfLong,index-> ThreadLocalRandom.current().nextInt(1000000));
        Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i+ "  " ));
        System.out.println();

        Arrays.parallelSort(arrayOfLong);
        Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + "   "));
    }
}
