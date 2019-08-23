package br.com.frw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> listaCompras = new ArrayList<String>();
        String item;
        int n = 0;


        do {
            System.out.println("1 - Adicione Item. ");
            System.out.println("2 - Remover Item. ");
            System.out.println("3 - Listar Itens. ");
            System.out.println("4 - Finalizar compras. ");
            n = Integer.parseInt(entrada.nextLine());


            switch (n){
                case 1:
                    System.out.println("Digite o nome do item que deseja comprar: ");
                    item = entrada.nextLine();
                    listaCompras.add(item);
                    break;
                case 2:
                    System.out.println("informe o nome do item que deseja remover: ");
                    int numeroItem = Integer.parseInt(entrada.nextLine());
                    int indiceId = numeroItem -1;

                            listaCompras.remove(indiceId);


                    break;
                case 3:
                    for(int p = 0; p < listaCompras.size(); p++){
                        String vetor = listaCompras.get(p);
                        numeroItem = p + 1;
                        System.out.println(numeroItem + " - " + vetor);
                    }

                    break;
            }


        }while (n != 4);

    }

}
