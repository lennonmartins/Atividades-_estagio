import java.util.Scanner;

public class Exc21 {
    public static void main(String[] args) {
        int numero_1;
        int numero_2;
        int numero_3;
        int soma;
        boolean resultado = false;
        
        Scanner  leitor = new Scanner(System.in);
            System.out.println("Informe o primeiro número: ");
        numero_1 = leitor.nextInt();
        
        System.out.println("Informe o segundo número: ");
        numero_2 = leitor.nextInt();

        System.out.println("Informe o terceiro número: ");
        numero_3 = leitor.nextInt();

        soma = numero_1 + numero_2;
         
        if (soma == numero_3) {
            System.out.println(!resultado + " , a soma dos dois primeiros numero é igual ao terceiro" );
        } else {
            System.out.println(resultado+ " , a soma dos dois primeiros numero é diferente do terceiro");
        }
        leitor.close();
    }
}
