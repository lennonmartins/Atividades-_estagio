import java.util.Scanner;

public class Exc20 {
    public static void main(String[] args) {
        String numeroString;
        int numero;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número em String: ");
        numeroString = leitor.nextLine();

        numero = Integer.parseInt(numeroString);
        System.out.println("O número inteiro é: " + numero);

        leitor.close();
    }
}
