package br.com.frw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        List<String> guardeNome= new ArrayList<String>();
        List<Float> guardeTotal= new ArrayList<Float>();
        List<Float> guardeAtvd= new ArrayList<Float>();

        int n, conteaprov = 0, conterecu = 0, contereprov = 0;
        Float exercicios, prova1, prova2, prova3, notaTotal;
        String turma, aluno;
        boolean desejaContinuar;
        boolean primeiraExecucao = true;

        Float maiorNotaTotal = 0.0F;
        String nomeMaiorTotal = " ";
        
        Float maiorNotaAtvd = 0.0F;
        String nomeMaiorAtvd = " ";
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Digite o nome da turma");
            turma = entrada.nextLine();

            System.out.println("Digite o nome do aluno");
            aluno = entrada.nextLine();
            guardeNome.add(aluno);

            System.out.println("Digite a pontuação de Exercicios: ");
            exercicios = Float.parseFloat(entrada.nextLine());
            guardeAtvd.add(exercicios);

            System.out.println("Digite a pontuação da 1ª Prova: ");
            prova1 = Float.parseFloat(entrada.nextLine());

            System.out.println("Digite a pontuação da 2ª Prova: ");
            prova2 = Float.parseFloat(entrada.nextLine());

            System.out.println("Digite a pontuação da 3ª Prova: ");
            prova3 = Float.parseFloat(entrada.nextLine());
            notaTotal = exercicios + prova1 + prova2 + (prova3 * 2);

            if (notaTotal > 100.0) {

                notaTotal = 100F;
                System.out.println("Nota Total :" + notaTotal);
            } else {
                System.out.println("Nota Total :" + notaTotal);
            }
            guardeTotal.add(notaTotal);
            if (notaTotal >= 60.0) {
                System.out.println("Aprovado");
                conteaprov ++;
            }

            else if (notaTotal >= 50 && notaTotal < 60) {
                System.out.println("Prova de recuperação I");
                conterecu ++;
            }

            else if (notaTotal >= 40 && notaTotal < 50) {
                System.out.println("Prova de recuperação II");
                conterecu ++;
            }

            else {
                System.out.println("Reprovado");
                contereprov ++;
            }

            System.out.println("Deseja adicionar mais notas aos alunos? (S/N)");
            String opcao = entrada.nextLine();
            desejaContinuar = opcao.equalsIgnoreCase("s");


            if(primeiraExecucao){

               maiorNotaTotal = notaTotal;
               maiorNotaAtvd = exercicios;
               nomeMaiorTotal = aluno;
                nomeMaiorAtvd= aluno;

                primeiraExecucao = false;
            }

            else{
                if(notaTotal > maiorNotaTotal){
                   maiorNotaTotal = notaTotal;
                    nomeMaiorTotal = aluno;
                }
                if(exercicios > maiorNotaAtvd){
                    maiorNotaAtvd = exercicios;
                    nomeMaiorAtvd = aluno;

                }
            }
            

        }while (desejaContinuar);


        System.out.println("Maior nota TOTAL: " + maiorNotaTotal + " Aluno: " +nomeMaiorTotal);
        System.out.println("Maior nota Atividade: " + maiorNotaAtvd + " Aluno: " +nomeMaiorAtvd);
        System.out.println("Alunos REPROVADOS: " + contereprov);

    }
}
