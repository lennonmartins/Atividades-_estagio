import java.util.Scanner;

public class Exc24 {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 60;
        // int resultado;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        numero1 = leitor.nextInt();

        System.out.print("Informe o segundo número: ");
        numero2 = leitor.nextInt();

        if (numero1 == numero2) {
            System.out.print("0");
        } else {
            if (numero1 % 6 == numero2 % 6) {
                if (numero1 < numero2) {
                    System.out.print(numero1 + " é o menor número.");
                } else {
                    System.out.print(numero2 + " é o menor número.");
                }
            } else {
                if (numero1 < numero2) {
                    System.out.print(numero2 + " é o maior número.");
                } else {
                    System.out.print(numero1 + " é o maior número.");
                }
            }
        }
        leitor.close();
    }

}
