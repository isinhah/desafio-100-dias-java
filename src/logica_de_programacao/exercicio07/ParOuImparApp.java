package logica_de_programacao.exercicio07;

/* Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números pares desses números. */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ParOuImparApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira a quantidade de números: ");
        int quantidade = sc.nextInt();

        double[] listaNumeros = new double[quantidade];
        double[] pares = new double[quantidade];
        double[] impares = new double[quantidade];
        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Insira o " + (i+1) + " número: ");
            listaNumeros[i] = sc.nextDouble();

            if (listaNumeros[i] % 2 == 0) {
                pares[numerosPares] = listaNumeros[i];
                numerosPares++;
            } else {
                impares[numerosPares] = listaNumeros[i];
                numerosImpares++;
            }
        }

        // redimensiona os arrays para remover os espaços não utilizados
        pares = Arrays.copyOf(pares, numerosPares);
        impares = Arrays.copyOf(impares, numerosImpares);

        System.out.println("Lista de números: " + Arrays.toString(listaNumeros));
        System.out.println("Lista de números PARES: " + Arrays.toString(pares));
        System.out.println("Lista de números IMPARES: " + Arrays.toString(impares));
        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números impares: " + numerosImpares);

        sc.close();
    }
}
