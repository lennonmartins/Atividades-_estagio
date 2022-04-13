import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        double termo1;
        double termo2;
        double troca;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira variável: ");
        termo1 = leitor.nextDouble();

        System.out.println("Informe a segunda variável: ");
        termo2 = leitor.nextDouble();

        System.out.println("Antes da troca: Variável 1 = " + termo1 + " | Variável 2 = " + termo2);
        
        troca = termo1;
        termo1 = termo2;
        termo2 = troca;

        System.out.println("Depois da troca: Variável 1 = " + termo1 + " | Variável 2 = " + termo2);

        leitor.close();
    }
}
