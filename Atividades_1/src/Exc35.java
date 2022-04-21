import java.util.Scanner;



public class Exc35 {
    public static void main(String[] args) {
        double salarioMinimo;
        double salarioColaborador;
        double quantidadeSalario;

        salarioMinimo = 788;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o salário do colaborador: ");
        salarioColaborador = leitor.nextDouble();

        quantidadeSalario = salarioColaborador/salarioMinimo;

        System.out.println("O colaborador recebe " +  String.format("%.1f", quantidadeSalario)  + " salários mínimos");

        leitor.close();
    }
}
