import java.util.Scanner;

public class Exc9 {

    public static void main(String[] args) {
        // int numeroBinario[] = new int[10];
        int numeroDecimal = 0;
        int num;
        // int i = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número binário: ");
        num = leitor.nextInt();

        char[] caracteres = Integer.toString(num).toCharArray();
        int[] numeroBinario = new int[caracteres.length];

        int j = 0;
        for (char numerosBinario : caracteres) {

            numeroBinario[j] = Character.getNumericValue(numerosBinario);
            //System.out.print(numeroBinario[j]);
            j++;
        }

        for (int i = 0; i <= numeroBinario.length - 1;) {
            for (int k = numeroBinario.length - 1; k >= 0; k--) {
                numeroDecimal += (numeroBinario[i] * Math.pow(2, k));
                //System.out.println(numeroBinario[i]);
                i++;
            }
        }

        System.out.println("O número decimal correspondente é: " + numeroDecimal);
        leitor.close();

        /*
         * Scanner leitor = new Scanner(System.in);
         * String entrada = leitor.next();
         * int potencia = 0;
         * int decimal = 0;
         * for (int i = entrada.length() - 1; i >= 0; i--) {
         * decimal = decimal + Math.pow(2, potencia) *
         * Character.getNumericValue(entrada.charAt(i));
         * potencia++;
         * leitor.close();
         * 
         * }
         * System.out.println("O binário convertido em decimal é: " + decimal);
         */

    }

}