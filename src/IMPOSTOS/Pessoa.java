package IMPOSTOS;
import java.util.Scanner;

public class Pessoa {
    public double rendaSalario;
    public double rendaServico;
    public double ganhoCapital;
    public double gastosSaude;
    public double gastosEducacao;

    public Pessoa(double rendaSalario, double rendaServico, double ganhoCapital, double gastosSaude, double gastosEducacao) {
        this.rendaSalario = rendaSalario;
        this.rendaServico = rendaServico;
        this.ganhoCapital = ganhoCapital;
        this.gastosSaude = gastosSaude;
        this.gastosEducacao = gastosEducacao;
    }

    // Getters
    public double getRendaSalario() {
        return rendaSalario;
    }

    public double getRendaServico() {
        return rendaServico;
    }

    public double getGanhoCapital() {
        return ganhoCapital;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }
}
