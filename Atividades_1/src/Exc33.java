import java.util.Scanner;

public class Exc33 {
    public static void main(String[] args) {
        double saldo;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o seu saldo: ");
        saldo = leitor.nextDouble();

        saldo =  saldo*1.01;

        System.out.println("seu saldo após o reajuste de 1% é de : R$ " +  String.format("%.2f", saldo) );

        leitor.close();
    }
}
