package com.example;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 2 = " + calc.add(5, 2));
        System.out.println("5 - 2 = " + calc.subtract(5, 2));
        System.out.println("5 * 2 = " + calc.multiply(5, 2));
        System.out.println("5 / 2 = " + calc.divide(5, 2));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
    
}
