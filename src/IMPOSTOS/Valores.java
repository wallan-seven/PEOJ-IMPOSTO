package IMPOSTOS;
import java.util.Scanner;

public class Valores {
	    private Pessoa pessoa;

	    public Valores(Pessoa pessoa) {
	        this.pessoa = pessoa;
	    }
    public double calcularImpostoSalario() {
        double rendaSalario = pessoa.getRendaSalario();
        if (rendaSalario < 3000 * 12) {
            return 0;
        } else if (rendaSalario < 5000 * 12) {
            return rendaSalario * 0.10;
        } else {
            return rendaSalario * 0.20;
        }
    }

    public double calcularImpostoServico() {
        return pessoa.getRendaServico() * 0.15;
    }

    public double calcularImpostoGanhoCapital() {
        return pessoa.getGanhoCapital() * 0.20;
    }

	public double desconto(double impostoBruto) {
        double gastosTotais = pessoa.getGastosSaude() + pessoa.getGastosEducacao();
        double limiteAbatimento = impostoBruto * 0.30;
        return Math.min(gastosTotais, limiteAbatimento);
    }

    public double calcImpostoLiquido() {
        double impostoSalario = calcularImpostoSalario();
        double impostoServico = calcularImpostoServico();
        double impCapital = calcularImpostoGanhoCapital();

        double impostoBruto = impostoSalario + impostoServico + impCapital;
        double abatimento = desconto(impostoBruto);

        return impostoBruto - abatimento;
    }

    public void apresentaRelatorio() {
        double impSalario = calcularImpostoSalario();
        double impServico = calcularImpostoServico();
        double impCapital = calcularImpostoGanhoCapital();
        double impBruto = impSalario + impServico + impCapital;
        double desconto = desconto(impBruto);
        double impLiquido = calcImpostoLiquido();

        System.out.println("\n--- Relatório de Imposto de Renda ---");
        System.out.printf("Imposto referente ao salário: R$ %.2f%n", impSalario);
        System.out.printf("Imposto referente aos serviços: R$ %.2f%n", impServico);
        System.out.printf("Imposto referente ao ganho de capital: R$ %.2f%n", impCapital);
        System.out.printf("Imposto bruto: R$ %.2f%n", impBruto);
        System.out.printf("Descontos: R$ %.2f%n", desconto);
        System.out.printf("Imposto líquido: R$ %.2f%n", impLiquido);
    }
}

