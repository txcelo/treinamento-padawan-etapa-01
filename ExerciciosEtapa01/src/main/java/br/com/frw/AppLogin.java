package br.com.frw;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLogin {

    public static void main(String[] args) {
        List<String> loginValidos = new ArrayList<String>();
        List<String> senhasValidas = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);

        loginValidos.add("admin");
        senhasValidas.add("admin");

        loginValidos.add("user");
        senhasValidas.add("user");

        loginValidos.add("incative");
        senhasValidas.add("pass");

        System.out.println("Informe seu login: ");
        String login = entrada.nextLine();

        System.out.println("Informe sua senha: ");
        String senha = entrada.nextLine();

        boolean logado = false;

        for (int i = 0; i < loginValidos.size(); i++){
            String loginValido = loginValidos.get(i);
            if(loginValido.equals(login)){
                String senhaValida = senhasValidas.get(i);

                if (senhaValida.equals(senha)){

                   if(loginValido.equals("admin")){
                       logado = true;
                       System.out.println("Bem vindo, Admin!");
                       break;
                   }

                    if(loginValido.equals("user")){
                        logado = true;
                        System.out.println("Bem vindo, User!");
                        break;
                    }

                    if(loginValido.equals("incative")){
                        logado = true;
                        System.out.println("Seu usuário está inativo!");
                        break;
                    }

                }

            }
        }

        if(!logado){
            System.out.println("Usuário não encontrado!");
        }
    }

}
