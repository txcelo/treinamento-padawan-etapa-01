package br.com.frw;

import java.util.Scanner;

public class Inteiro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inteiro;

        System.out.println("Digite o valor de consulta");
        inteiro = entrada.nextInt();

        for(int cont = 1; cont < inteiro; cont++ ){
            System.out.println(cont);
        }


    }

}
