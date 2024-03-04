package com.xyzcorp;

import java.util.stream.Stream;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        Stream.of(1,2,3,4,5)
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}
