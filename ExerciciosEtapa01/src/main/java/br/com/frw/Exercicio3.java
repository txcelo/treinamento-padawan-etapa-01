package br.com.frw;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Float atividade1, atividade2, prova1, prova2, prova3, notaTotal;
        String turma, aluno;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da turma");
        turma = entrada.nextLine();

        System.out.println("Digite o nome do aluno");
        aluno = entrada.nextLine();

        System.out.println("Digite a pontuação da atividade 1: ");
        atividade1 = entrada.nextFloat();

        System.out.println("Digite a pontuação da atividade 2: ");
        atividade2 = entrada.nextFloat();

        System.out.println("Digite a pontuação da 1ª Prova: ");
        prova1 = entrada.nextFloat();

        System.out.println("Digite a pontuação da 2ª Prova: ");
        prova2 = entrada.nextFloat();

        System.out.println("Digite a pontuação da 3ª Prova: ");
        prova3 = entrada.nextFloat();

        notaTotal = atividade1 + atividade2 + prova1 + prova2 + prova3;

        if(notaTotal >= 60.0){
            System.out.println("Aprovado");
        }
        else if(notaTotal >= 50 && notaTotal < 60){
            System.out.println("Prova de recuperação I");
        }

        else if(notaTotal >= 40 && notaTotal < 50){
            System.out.println("Prova de recuperação II");
        }

        else{
            System.out.println("Reprovado");
        }

    }


}

