package com.test.rmit;

public class Main {
    public static void main(String[] args) {


        Calculator cacl1 = new Calculator();
        System.out.println("Addition: " + cacl1.add(10, 5));
        System.out.println("Subtraction: " + cacl1.subtract(10, 5));
        System.out.println("Multiplication: " + cacl1.multiply(10, 5));
        // Hello World
        System.out.println("Division: " + cacl1.divide(10, 5));
    }
}