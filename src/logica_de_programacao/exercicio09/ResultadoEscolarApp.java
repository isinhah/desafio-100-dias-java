package logica_de_programacao.exercicio09;

import java.util.Scanner;

public class ResultadoEscolarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota da prova: ");
        double nota = sc.nextDouble();

        String resultado = nota > 6 ? "Aprovado" : (nota == 6 ? "Na média" : "Reprovado");

        System.out.println(resultado);

        sc.close();
    }
}
