import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro Termo: ");
        primeiroTermo = leitor.nextInt();

        System.out.println("Informe o segundo Termo: ");
        segundoTermo = leitor.nextInt();

        int soma = primeiroTermo + segundoTermo;
        System.out.println(primeiroTermo + " + " + segundoTermo + " = " + soma);

        int subtracao = primeiroTermo - segundoTermo;
        System.out.println(primeiroTermo + " - " + segundoTermo + " = " + subtracao);

        int multiplicacao = primeiroTermo * segundoTermo;
        System.out.println(primeiroTermo + " x " + segundoTermo + " = " + multiplicacao);

        int divisao = primeiroTermo / segundoTermo;
        System.out.println(primeiroTermo + " / " + segundoTermo + " = " + divisao);

        int resto = primeiroTermo % segundoTermo;
        System.out.println(primeiroTermo + " mod " + segundoTermo + " = " +  resto);

        leitor.close();
    }
   
}
