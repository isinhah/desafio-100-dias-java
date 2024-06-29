package logica_de_programacao.exercicio08;

import java.util.Arrays;
import java.util.Scanner;

/* Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. */

public class ComparacaoPrecosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos? ");
        int quantidade = sc.nextInt();

        double[] listaProdutos = new double[quantidade];

        double maiorNumero = 0.0;
        double menorNumero = 0.0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Insira o preço do produto" + (i+1) + ": ");
            listaProdutos[i] = sc.nextDouble();

            if (listaProdutos[i] > maiorNumero) {
                maiorNumero = listaProdutos[i];
            } else {
                menorNumero = listaProdutos[i];
            }
        }

        double total = 0.0;
        for (double produto : listaProdutos) {
            total = total + produto;
        }

        System.out.println("O maior preço é: " + maiorNumero);
        System.out.println("O menor preço é: " + menorNumero);
        System.out.printf("Todos os preços: " + Arrays.toString(listaProdutos));
        System.out.println("Valor total dos produtos: " + total);

        sc.close();
    }
}
