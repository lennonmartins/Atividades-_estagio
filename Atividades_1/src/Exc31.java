import java.util.Scanner;

public class Exc31 {
    public static void main(String[] args) {
        int idadeAnos;
        int idadeMeses;
        int idadeDias;
        int somaDias;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe quantos anos você tem considerando seus anos, meses e dias, respectivamente:");
        idadeAnos = leitor.nextInt();
        idadeMeses = leitor.nextInt();
        idadeDias = leitor.nextInt();

        somaDias = idadeAnos * 365;
        somaDias += idadeMeses * 30;
        somaDias += idadeDias;

        System.out.println("Os dados informados foram " +  idadeAnos + " ano(s), " + idadeMeses + " mes(es) e " + idadeDias + " dia(s) = " + somaDias + " dia(s)");

        leitor.close();   
    }
}
