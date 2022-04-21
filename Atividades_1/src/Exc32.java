import java.util.Scanner;

public class Exc32 {
    public static void main(String[] args) {
        double nota1 = 8;
        double nota2 = 9;
        double nota3 = 7;
        double nota4 = 4;
        double nota5 = 5;
        double nota6 = 6;
        double media1;
        double media2;
        double mediaDasMedias;

        Scanner leitor = new Scanner(System.in);

        media1 = (nota1 + nota2 + nota3) / 3;

        media2 = (nota4 + nota5 + nota6) / 3;

        mediaDasMedias = (media1 + media2) / 2;

        System.out.println("Sua média final é: " + mediaDasMedias);

        leitor.close();
    }
}
