package logica_de_programacao.exercicio01;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int opcao;
        do {
            System.out.println("\n---- CALCULADORA ----" + "\n1. Soma" + "\n2. Subtração" + "\n3. Multiplicação" + "\n4. Divisão" + "\n5. Sair");
            System.out.println("Insira a operação desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n---- SOMA ----");
                    System.out.print("Quantos numeros voce deseja somar? ");
                    int quantidadeSoma = sc.nextInt();
                    double[] numeros = new double[quantidadeSoma];

                    for (int i = 0; i < quantidadeSoma; i++) {
                        System.out.print("Insira o " + (i + 1) + " número: ");
                        numeros[i] = sc.nextDouble();
                    }
                    double soma = calculadora.soma(numeros);
                    System.out.println("\nO resultado da soma é: " + soma);
                    break;
                case 2:
                    System.out.println("\n---- SUBTRAÇÃO ----");
                    System.out.println("Insira o primeiro numero: ");
                    double numeroUm = sc.nextDouble();
                    System.out.println("Insira o segundo numero: ");
                    double numeroDois = sc.nextDouble();
                    double subResultado = calculadora.subtracao(numeroUm, numeroDois);
                    System.out.println("\nO resultado da subtração é: " + subResultado);
                    break;
                case 3:
                    System.out.println("\n---- MULTIPLICAÇÃO ----");
                    System.out.println("Quantos numeros voce deseja multiplicar? ");
                    int quantidadeMultiplicacao = sc.nextInt();
                    double[] numerosMultiplicacao = new double[quantidadeMultiplicacao];

                    for (int i = 0; i < quantidadeMultiplicacao; i++) {
                        System.out.println("Insira o " + (i + 1) + " numero: ");
                        numerosMultiplicacao[i] = sc.nextDouble();
                    }
                    double multiplicacao = calculadora.multiplicacao(numerosMultiplicacao);
                    System.out.println("O resultado da multiplicação é: " + multiplicacao);
                    break;
                case 4:
                    System.out.println("\n---- DIVISÃO ----");
                    System.out.println("Insira o primeiro número");
                    double primeiro = sc.nextDouble();
                    System.out.println("Insira o segundo número: ");
                    double segundo = sc.nextDouble();
                    double resultadoDivisao = calculadora.divisao(primeiro, segundo);
                    System.out.println("O resultado da divisão é: " + resultadoDivisao);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma das opções do menu.");
            }
        } while (opcao != 5);

        sc.close();
    }
}
