import java.util.Scanner;

public class Exc22_1 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        boolean resultado = true;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número o primeiro número: ");
        numero1 = leitor.nextInt();

        System.out.println("Informe o número o segundo número: ");
        numero2 = leitor.nextInt();

        System.out.println("Informe o número o terceiro número: ");
        numero3 = leitor.nextInt();


        if (numero2> numero1 && numero3>numero2) {
            System.out.println("O resultado é: " + resultado);
        } else {
            resultado = false;
            System.out.println("O resultado é: " + resultado);
        }

        leitor.close();
    }
}
