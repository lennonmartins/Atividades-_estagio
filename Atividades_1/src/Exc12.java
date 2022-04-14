import java.util.Arrays;
import java.util.Scanner;

public class Exc12 {

    public static void main(String[] args) {
        String fruta = "banana";
        String[] frutaInvertida;
        String nomeInvertido;
    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a fruta: ");
        fruta = leitor.nextLine();

       frutaInvertida = fruta.split("(?!^)");
       fruta = Arrays.toString(frutaInvertida);
       //System.out.println(fruta);

        for (int i = frutaInvertida.length-1; i >= 0 ; i--) {
            nomeInvertido = frutaInvertida[i];
            System.out.print(nomeInvertido);
        }
        
        leitor.close();

    }
}
