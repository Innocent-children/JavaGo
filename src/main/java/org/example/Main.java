package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world\u2122!");
        IntStream intStream = "abc".codePoints();
        int[] array = intStream.toArray();
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}