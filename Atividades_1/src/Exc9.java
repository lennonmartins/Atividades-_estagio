import java.util.Scanner;

public class Exc9 {

    public static void main(String[] args) {
        // int numeroBinario[] = new int[10];
        int numeroDecimal = 0;
        int num;
        int i = 0;

        Scanner leitor = new Scanner(System.in);
        num = leitor.nextInt();

        char[] caracteres = Integer.toString(num).toCharArray();
        int[] numeroBinario = new int[caracteres.length];
        
        int j = 0;
        for (char numerosBinario : caracteres) {
           
            numeroBinario[j] = Character.getNumericValue(numerosBinario);
            System.out.print(numeroBinario[j]);
            j++;
        }

        for (i = numeroBinario.length-1; i >= 0; i--) {
            numeroDecimal += (numeroBinario[i] * Math.pow(2, numeroBinario.length-1));
            System.out.println(numeroBinario[i]);

        }

        System.out.println(numeroDecimal);
        leitor.close();

        /*
         * 5
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