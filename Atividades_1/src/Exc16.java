import java.util.Scanner;

public class Exc16 {
    public static void main(String[] args) {
        int numero;
        int numero2;
        int numero3;
        int soma;
        String numeroString;
        String somaString;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor a ser somado: ");
        numero = leitor.nextInt();

        numeroString = Integer.toString(numero);
        somaString = numeroString + numeroString;
        numero2 = Integer.parseInt(somaString);
        soma = numero + Integer.parseInt(somaString);
        somaString =  somaString + numeroString;
        numero3 = Integer.parseInt(somaString);
        soma = soma + Integer.parseInt(somaString);
        
        System.out.println("O resultaod é: " + numero + " + " + numero2 + " + " + numero3 + " = " + soma);

        leitor.close();
    }
}
