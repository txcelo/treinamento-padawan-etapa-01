package br.com.frw;

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            String turma, aluno;


            System.out.println("Digite o nome da turma");
            turma = entrada.nextLine();

            System.out.println("Digite o nome do aluno");
            aluno = entrada.nextLine();

            System.out.println("Digite a primeira nota do aluno");
            Float nota1 = entrada.nextFloat();

            System.out.println("Digite a segunda nota do aluno");
            Float nota2 = entrada.nextFloat();

            System.out.println("Digite a terceira nota do aluno");
            Float nota3 = entrada.nextFloat();

            Float notatotal = nota1 + nota2 + nota3;

            System.out.println("Nome do aluno: " + aluno + " - Turma: " + turma + "Nota total:" + notatotal);

        }


    }
