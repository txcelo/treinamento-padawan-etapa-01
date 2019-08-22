package br.com.frw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewLista {

    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<String>();
        List<Float> listaComissoes = new ArrayList<Float>();

        Scanner entrada = new Scanner(System.in);

        boolean desejaContinuar;
        boolean primeiraExecucao = true;
        String nomeMaiorComissao = "";
        String nomeMenorComissao = "";

        Float valorMaiorComissao = 0.0f;
        Float valorMenorComissao = 0.0f;
        Float totalComissao = 0.0f;

        do {

            System.out.println("Digite o nome do vendedor: ");
            String nome = entrada.nextLine();
            listaNomes.add(nome);

            System.out.println("Digite a comissão do vendedor: ");
            Float comissao = Float.parseFloat(entrada.nextLine());
            totalComissao = totalComissao + comissao;
            listaComissoes.add(comissao);

            System.out.println("Deseja adicionar mais comissoes e vendedores: (S/N)");
            String opcao = entrada.nextLine();
            desejaContinuar = opcao.equalsIgnoreCase("s");

            if(primeiraExecucao){

                valorMaiorComissao = comissao;
                valorMenorComissao = comissao;
                nomeMaiorComissao = nome;
                nomeMenorComissao = nome;

                primeiraExecucao = false;
            }

            else{
                if(comissao > valorMaiorComissao){
                    valorMaiorComissao = comissao;
                    nomeMaiorComissao = nome;
                }
                if(comissao < valorMenorComissao){
                    valorMenorComissao = comissao;
                    nomeMenorComissao = nome;

                }
            }

        }while(desejaContinuar);

        Float media = totalComissao / listaComissoes.size();

        System.out.println("Maior Comissao: " + valorMaiorComissao + " Nome - " + nomeMaiorComissao);
        System.out.println("Menor Comissao: " + valorMenorComissao + " Nome - " + nomeMenorComissao);
        System.out.println("Média: " + media);


    }

}
