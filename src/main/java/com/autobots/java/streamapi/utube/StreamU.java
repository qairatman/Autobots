package com.autobots.java.streamapi.utube;

import java.util.List;
import java.util.Random;

import static jdk.internal.org.jline.utils.Colors.s;

public class StreamU {
    public static void main(String[] args) {
        Flyable flyable = (a,b)->b+a;
        System.out.println(flyable.calk(0,2));

        Flyable fble = (a,g)-> {
            a+=2;
            g+=2;
            return g+a;
        };
         System.out.println(fble.calk(1,2));
    }


    }



