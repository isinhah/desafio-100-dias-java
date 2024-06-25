package logica_de_programacao.exercicio04;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1L de tinta: 6 metros
 * Lata de 18L custa 80 reais: cobre 108 metros
 * Galão de 3.5L custa 25 reais: cobre 21 metros
 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações: comprar apenas latas de 18 litros; comprar apenas galões de 3,6 litros
 * De forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias
 * */

public class LojaTintaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("---- LOJA DE TINTAS ----");
        System.out.print("Insira o tamanho em metros quadrados da área a ser pintada: ");
        double area = sc.nextDouble();

        // QUANTIDADE DE LITROS QUE PRECISO
        double quantidadeLitros = area / 6.0;
        System.out.printf("Quantidade de litros de tinta necessárias: %.2f litros", quantidadeLitros);

        // LATA DE 18L: arrendondando para cima
        int quantidadeLata = (int) Math.ceil(quantidadeLitros / 18.0);
        double precoLata = quantidadeLata * 108;

        // GALAO DE 3.5L: arrendondando para cima
        int quantidadeGalao = (int) Math.ceil(quantidadeLitros / 3.5);
        double precoGalao = quantidadeGalao * 21;

        System.out.println("\n---- OPÇÕES DE COMPRA ----");
        System.out.printf("Quantidade de latas de 18L necessárias: %d, com preço de %.1f", quantidadeLata, precoLata);
        System.out.printf("\nQuantidade de galões de 3.5L necessários: %d, com preço de %.1f", quantidadeGalao, precoGalao);

        sc.close();
    }
}
