package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO: ");
        int n = scanner.nextInt();

        if (verifica(n)){
            System.out.println(n + " PERTENCE A SEQUENCIA");
        } else {
            System.out.println(n + " NAO PERTENCE A SEQUENCIA");
        }
    }

    public static boolean verifica(int valor) {
        int a = 0, b = 1;

        while (a <= valor){
            if (a == valor){
                return true;
            }
            int c = a + b;
            a = b;
            b = c;
        } return false;
    }
}