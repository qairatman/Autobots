package com.autobots.java.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {
    public static void main(String[] args) {
        MathOperations addition =(a,b)->a+b;
        MathOperations multiple =(a,b)->a*b;
        System.out.println(addition.operation(1,5));
        System.out.println(multiple.operation(3,34));

        //Принимает оьбъукт -Ю булин
        Predicate<String> isNotEmpty = s-> !s.isEmpty();
        System.out.println( isNotEmpty.test("Java"));

        Function<Integer,String> toStringFun = i-> "Chilso "+i;
        System.out.println(toStringFun.apply(1));

        Consumer<String> print = s -> System.out.println(s);
        print.accept("kair");

    }
}
