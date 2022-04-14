import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número de dois dígitos a ser somado: ");
        numero1 = leitor.nextInt();

        numero2 = numero1%10;
        numero1 = numero1/10;
        resultado = numero1 + numero2;

        System.out.println("A soma dos dois dígitos é igual a: " + resultado);

        leitor.close();
    }
}
