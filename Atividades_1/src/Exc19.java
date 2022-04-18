
public class Exc19 {
    public static void main(String[] args) {

        System.out.print("Dividido por 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print (i + ", ");
            }
        }
        System.out.println();

        System.out.print("Dividido por 5: ");
        for (int j = 1; j < 100; j++) {
            if (j % 5 == 0) {
                System.out.print(j+ ", ");
            }
        }
        System.out.println();

        System.out.print("Dividido por 3 e 5: ");
        for (int k = 1; k < 100; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.print (k+ ", ");

            }
        }

    }
}
