package org.example;

public class Fibonacci {

    public int calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O índice não pode ser negativo.");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10;
        System.out.println("O " + n + "º número de Fibonacci é: " + fibonacci.calcularFibonacci(n));
    }
}
