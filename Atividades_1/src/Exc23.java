import java.util.Scanner;

public class Exc23 {
    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 21;
        int numero3 = 22;
        boolean resultado = true;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        numero1 = leitor.nextInt();

        System.out.print("Informe o segundo número: ");
        numero2 = leitor.nextInt();

        System.out.print("Informe o terceiro número: ");
        numero3 = leitor.nextInt();

        if (numero1 > 20 && numero2 > 20 && numero3 > 20) {
            if (numero1 - numero2 > numero3 || numero2 - numero3 > numero3) {
                System.out.println(resultado);
            } else {
                resultado = false;
                System.out.println(resultado);
            }
        } else {
            resultado = false;
            System.out.println(resultado);
        }

        leitor.close();
    }
}
