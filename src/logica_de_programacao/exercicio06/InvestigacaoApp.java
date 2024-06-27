package logica_de_programacao.exercicio06;

/* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita"
, entre 3 e 4 como "Cúmplice" e 5 como "Assassino"
Caso contrário, ele será classificado como "Inocente". */

import java.util.Scanner;

public class InvestigacaoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== QUESTIONARIO =====" + "\nResponda com 'sim' ou 'nao': ");

        System.out.println("Telefonou para vitima? ");
        String resposta1 = sc.nextLine().toLowerCase();

        System.out.println("Esteve no local do crime? ");
        String resposta2 = sc.nextLine().toLowerCase();

        System.out.println("Mora perto da vitima? ");
        String resposta3 = sc.nextLine().toLowerCase();

        System.out.println("Devia para vitima? ");
        String resposta4 = sc.nextLine().toLowerCase();

        System.out.println("Já trabalhou com a vítima? ");
        String resposta5 = sc.nextLine().toLowerCase();

        int contador = 0;
        if (resposta1.equals("sim")) contador++;
        if (resposta2.equals("sim")) contador++;
        if (resposta3.equals("sim")) contador++;
        if (resposta4.equals("sim")) contador++;
        if (resposta5.equals("sim")) contador++;

        String classificacao = switch (contador) {
            case 2 -> "Suspeita";
            case 3, 4 -> "Cúmplice";
            case 5 -> "Assassino";
            default -> "Inocente";
        };

        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
