package com.gr.jiang.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.io.File.separator;

/**
 * Created by jiang on 2017/9/5.
 */
public class Test1 {
    public static void main(String args[]) {
        Arrays.asList(1,2,3454,565,12).forEach(i -> System.out.println(i + separator));

        Arrays.asList(3,23,112,13,123).sort((e1,e2) -> e1.compareTo(e2));
        List<Integer> lists = Arrays.asList(23,54,564,67,12,34);
        lists.sort((e1,e2)->{
            if (e1 > e2)
                return 1;
            else
                return -1;
        });

        for (Integer val : lists){
            System.out.println("val = "+val);
        }

        lists.forEach(n -> System.out.println(n+separator));

        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        filter(languages,(str)->true);
        System.out.println();
        filter(languages,(str)->false);
        System.out.println();
        filter(languages,(str)->str.toString().length()>4);

        List costBeforeTax = Arrays.asList(100.0, 200, 300, 400, 500);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String vals = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(vals);

        Stream mx = G7.stream().map(x2 -> x2.toUpperCase());


//        double bill = costBeforeTax.stream().map((e)-> 0.12).reduce((sum,cost) -> sum+cost).get();
//        double bill = costBeforeTax.stream().map((cost) -> cost + 2.12*cost).reduce((sum, cost) -> sum + cost).get();
    }

    public static void filter(List<String> names, Predicate condition){
        for (String name : names){
            if (condition.test(name)){
                System.out.println(name);
            }
        }
    }
}
