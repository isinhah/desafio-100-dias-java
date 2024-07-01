package logica_de_programacao.exercicio10;

import java.util.Scanner;

/* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral */
public class ConcessionariaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CONCESSIONARIA CARANGO VELHO ---");

        String resposta;
        int quantidadeCarros2000 = 0;
        int totalDeCarros = 0;
        do {
            System.out.println("Insira o valor do veículo: ");
            double valor = sc.nextDouble();

            System.out.println("Insira o ano do veículo: ");
            int ano = sc.nextInt();

            double desconto;
            if (ano <= 2000) {
                desconto = valor * 0.12;
                quantidadeCarros2000 ++;
            } else {
                desconto = valor * 0.7;
            }

            totalDeCarros ++;
            System.out.println("Valor do carro com desconto: " + desconto);

            System.out.println("Deseja inserir outro veiculo? s / n");
            resposta = sc.next(

            );
        } while (resposta.equals("s"));

        System.out.println("Total de carros com ano até 2000: " + quantidadeCarros2000);
        System.out.println("Total de carros inseridos: " + totalDeCarros);

        sc.close();
    }
}
