package IMPOSTOS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a renda anual com salário: ");
        double rendaSalario = scanner.nextDouble();

        
        double rendaServico = scanner.nextDouble();

        System.out.print("Informe a renda anual com ganho de capital: ");
        double ganhoCapital = scanner.nextDouble();

        System.out.print("Informe os gastos anuais com saúde: ");
        double gastosSaude = scanner.nextDouble();

        System.out.print("Informe os gastos anuais com educação: ");
        double gastosEducacao = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(rendaSalario, rendaServico, ganhoCapital, gastosSaude, gastosEducacao);

        Valores calculadora = new Valores(pessoa);
        calculadora.apresentaRelatorio();

        scanner.close();
    }
}
