package org.example;

public class Main {
    public static void main(String[] args) {

        String nome = "Higor Luiz";
        String inverte = inverter(nome);
        System.out.println(inverte);
    }

    public static String inverter(String a){
        char[] array = a.toCharArray(); //CONVERTE STRING EM ARRAY DE CARACTERES

        int b = 0; //indice inicio
        int c = array.length - 1; //indice final

        //laço que troca as posições
        while (b < c){
            char d = array[b];
            array[b] = array[c];
            array[c] = d;

            //MOVE OS INDICES
            b++;
            c--;
        } return new String(array);
    }
}