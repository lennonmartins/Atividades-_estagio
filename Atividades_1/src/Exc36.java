import java.util.Scanner;



public class Exc36 {
    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número para descobri seu sucessor e antecessor: ");
        numero = leitor.nextInt();
        leitor.close();

        System.out.println(" O antecessor de " + numero + " numero é o " + (numero-1) + " e seu sucessor é o " + (numero+1));
    }
}