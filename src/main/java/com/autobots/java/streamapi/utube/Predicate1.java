package com.autobots.java.streamapi.utube;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicate1 {
    static Predicate<Integer> isAdult = (age) -> age > 18;

    static Function<Integer, String> automate = (money) -> {
        if (money > 0) {
            return "You have money";
        } else {
            return "You have no money";
        }
    };

    static Consumer<String> nn = (s) -> System.out.println(s);

    static Supplier<Integer> sn =  () -> new Random().nextInt(100);

    public static void main(String[] args) {
        boolean res = isAdult.test(20);
        System.out.println(res);

        String mon = automate.apply(-1);
        System.out.println(mon);

        nn.accept("kka");

        System.out.println(sn.get());
    }

}
