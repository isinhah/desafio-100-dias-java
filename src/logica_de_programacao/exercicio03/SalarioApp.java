package logica_de_programacao.exercicio03;

import java.util.Scanner;

/* Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato
, faça um programa que nos dê respectivamente:
Salário bruto.
Quanto pagou ao INSS.
Quanto pagou ao sindicato.
Qual o salário líquido do funcionário. */

public class SalarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salario salario = new Salario();

        System.out.println("Quanto você recebe por hora? ");
        double horaTrabalhada = sc.nextDouble();
        System.out.println("Quantas horas trabalhadas no mês? ");
        double horaTrabalhadaMensal = sc.nextDouble();

        //Calculo do salario bruto e descontos
        double salarioBruto = horaTrabalhada * horaTrabalhadaMensal;
        double descontoImposto = salario.impostoRenda(salarioBruto);
        double descontoInss = salario.calculoINSS(salarioBruto);
        double descontoSindicato = salario.calculoSindicato(salarioBruto);
        double salarioLiquido = salarioBruto - descontoImposto - descontoInss - descontoSindicato;

        System.out.println("Salário bruto (sem desconto): " + salarioBruto);
        System.out.println("Salário bruto com desconto de 11% para o Imposto de Renda: " + descontoImposto);
        System.out.println("Salário bruto com desconto de 8% para o INSS: " + descontoInss);
        System.out.println("Salário bruto com desconto de 5% para o Sindicato: " + descontoSindicato);
        System.out.println("Salário Líquido: " + salarioLiquido);

        sc.close();
    }
}
