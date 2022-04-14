import java.util.Scanner;

public class Exc8 {

    public static void main(String[] args) {
        int numeroBinario[] = new int[10];
        int numeroDecimal = 0;
        int i = 0;

        System.out.println("Informe o número que você deseja descobrir o binário: ");
        Scanner leitor = new Scanner(System.in);
        numeroDecimal = leitor.nextInt();

        while (numeroDecimal > 0) {
            numeroBinario[i] = numeroDecimal % 2;
            numeroDecimal = numeroDecimal / 2;
            // System.out.print(numeroBinario[i]);
            i++;

        }
        boolean achouUm = false;
        for (int k = numeroBinario.length - 1; k >= 0; k--) {
            if (!achouUm) {
                achouUm = numeroBinario[k] == 1;
            }
            if (achouUm) {
                System.out.print(numeroBinario[k]);
            }
        }
        leitor.close();
    }
}

/*
 * public class Exc8 {
 * public static void main(String[] args) {
 * int i = 8;
 * String binstr = Integer.toBinaryString(i);
 * System.out.println(binstr);
 * }
 * }
 */
