package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Hello\nOana");
        System.out.println(24 + 25);
        System.out.println(76 / 3);
        System.out.println(-5 + (8 * 6));
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (-3 * 5) / 8);
        System.out.println(5 + (15 / (3 * 2) - (8 % 3)));
        int bucket = sum(2, 3);
        System.out.println(bucket);

        int pub = multiplication(4, 5);
        System.out.println(pub);
    }

    static int memberVariable = 10;


    public static void printName() {
        System.out.println("Hello");
        System.out.println("Oana");

    }

    public static int sum(int x, int y) {
        int result = x + y; //face operatia
        return result; // returneaza valoarea adunata
    }


    public static int multiplication(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int reduction ( int a, int b) {
        int result = a - b;
        return result;
    }

    public static int  divide ( int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }


}


