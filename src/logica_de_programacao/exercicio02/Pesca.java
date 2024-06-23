package logica_de_programacao.exercicio02;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

public class Pesca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Quantos peixes você pescou? ");
            int quantidadePeixes = sc.nextInt();

            double[] listaPeixes = new double[quantidadePeixes];
            for (int i = 0; i < quantidadePeixes; i++) {
                System.out.println("Insira o peso do " + (i + 1) + "º peixe: ");
                listaPeixes[i] = sc.nextDouble();
                sc.nextLine();
            }

            double totalMulta = 0.0;
            for (Double peso : listaPeixes) {
                if (peso > 50.0) {
                    double excesso = peso - 50.0;
                    double multa = excesso * 4.0;
                    totalMulta += multa; // Somar a multa ao total da multa
                }
            }

            System.out.println("Total de peixes: " + quantidadePeixes);
            System.out.println("Lista dos pesos: " + Arrays.toString(listaPeixes));
            System.out.println("Resultado da multa: R$" + totalMulta);
        } catch (Exception e) {
            System.out.println("Por favor apenas insira numeros. Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
