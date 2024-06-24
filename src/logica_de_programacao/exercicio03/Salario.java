package logica_de_programacao.exercicio03;

public class Salario {
    private Double salario;

    public Salario() {}

    public Double impostoRenda(double salario) {
        return salario * 0.11; //11%
    }

    public Double calculoINSS(double salario) {
        return salario * 0.08;
    }

    public Double calculoSindicato(double salario) {
        return salario * 0.05;
    }
}
