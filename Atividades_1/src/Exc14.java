import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        char caracter = 'Z';
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o caractere desejado: ");
        caracter = leitor.next().charAt(0);

        int inteiro = (int) caracter;

        System.out.println("O valor do seu caractere na tabela ASCII é: " + inteiro);

        leitor.close();
    }
}
