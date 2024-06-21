package logica_de_programacao.exercicio01;

public class Calculadora {
    public double soma(double[] numeros) {
        double resultado = 0;
        for (double num : numeros) {
            resultado = resultado + num;
        }
        return resultado;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double[] numeros) {
        double resultado = 1;
        for (double num : numeros) {
            resultado = resultado * num;
        }
        return resultado;
    }

    public double divisao(double a, double b) {
        return a / b;
    }
}
