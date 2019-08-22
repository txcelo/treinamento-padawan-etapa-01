package br.com.frw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {


    public Aluno cadastroNotas(){
        Aluno aluno1 = new Aluno();

        int n, conteaprov = 0, conterecu = 0, contereprov = 0;
        Float exercicios, prova1, prova2, prova3, notaTotal;
        String turma, aluno;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da turma");
        turma = entrada.nextLine();
        aluno1.setTurma(turma);

        System.out.println("Digite o nome do aluno");
        aluno = entrada.nextLine();
        aluno1.setNome(aluno);

        System.out.println("Digite a pontuação de Exercicios: ");
        exercicios = entrada.nextFloat();

        System.out.println("Digite a pontuação da 1ª Prova: ");
        prova1 = entrada.nextFloat();

        System.out.println("Digite a pontuação da 2ª Prova: ");
        prova2 = entrada.nextFloat();

        System.out.println("Digite a pontuação da 3ª Prova: ");
        prova3 = entrada.nextFloat();

        notaTotal = exercicios + prova1 + prova2 + (prova3 * 2);
        aluno1.setTotal(notaTotal);

        if (notaTotal > 100.0) {

            notaTotal = 100F;
            System.out.println("Nota Total :" + notaTotal);
        } else {
            System.out.println("Nota Total :" + notaTotal);
        }

        if (notaTotal >= 60.0) {
            aluno1.setStatus("Aprovado");
            conteaprov ++;
        }

        else if (notaTotal >= 50 && notaTotal < 60) {
            aluno1.setStatus("Recuperação I");
            conterecu ++;
        }

        else if (notaTotal >= 40 && notaTotal < 50) {
            aluno1.setStatus("Recuperação II");
            conterecu ++;
        }

        else {
            aluno1.setStatus("Reprovado");
            contereprov ++;
        }
        return aluno1;
    }

    public void maiorNota(){

        List<Aluno> lista = new ArrayList<Aluno>();

        for(int count = 0; count < 10; count++){
            lista.add(cadastroNotas());
        }


    }

}
