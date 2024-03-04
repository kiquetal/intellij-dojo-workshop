package com.xyzcorp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

       System.out.println(Stream.of(1, 2, 3, 4, 5)
                .flatMap(i -> Stream.of(-i, i, i + 2)).map(i -> i + 1)
                .filter(i -> i % 2 == 0).collect(Collectors.toList()));

    }
}
