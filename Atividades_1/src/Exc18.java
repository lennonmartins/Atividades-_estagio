import java.util.Scanner;

public class Exc18 {
    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número para saber se é par ou ímpar: ");
        numero = leitor.nextInt();

        if (numero%2 == 0) {
            System.out.println("1 - o número é par");            
        } else {
            System.out.println("0 - o número ímpar");
        }

        leitor.close();

    }
}
