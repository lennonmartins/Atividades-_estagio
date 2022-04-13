import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        double termo1 = 25.5;
        double termo2 = 3.5 ;
        double termo3 = 40.5;
        double termo4 = 4.5;
        double resultado;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro temro: ");
        termo1 = leitor.nextDouble();

        System.out.println("Informe o segundo temro: ");
        termo2 = leitor.nextDouble();

        System.out.println("Informe o terceiro temro: ");
        termo3 = leitor.nextDouble();

        System.out.println("Informe o quarto temro: ");
        termo4 = leitor.nextDouble();

        resultado = ((termo1 * termo2 - termo2 * termo2) / (termo3 - termo4));
        System.out.println(resultado);

        leitor.close();
    }
}