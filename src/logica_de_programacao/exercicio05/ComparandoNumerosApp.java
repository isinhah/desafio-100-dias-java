package logica_de_programacao.exercicio05;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/* Compare os números: Ache o maior número */

public class ComparandoNumerosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Insira a quantidade de números que você quer comparar: ");
        int quantidade = sc.nextInt();

        double[] listaNumeros = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Insira o " + (i+1) + " numero: ");
            listaNumeros[i] = sc.nextDouble();
        }

        double maiorNumero = listaNumeros[0]; //Supondo que o primeiro número é o maior
        for (double numero : listaNumeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }



        System.out.println("Lista de números: " + Arrays.toString(listaNumeros));
        System.out.println("O maior número é: " + maiorNumero);

        sc.close();
    }
}
