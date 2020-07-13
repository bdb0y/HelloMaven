package com.example.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
