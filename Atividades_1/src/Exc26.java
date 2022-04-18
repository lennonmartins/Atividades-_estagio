import java.io.Console;

public class Exc26 {
    public static void main(String[] args) {
        int numero = 4;
        int fator = 1;
        int resultado;

        if (numero == 0) {
            System.out.println("O fatorial de 0 é 1");
        } else {
            for (int i = 1; i < numero; i++) {
                fator *= i;
                resultado = numero * fator;
                System.out.println("O fatorial de " + numero + " é ("+i+"!) * " + numero + " = "  + resultado);
            }
        }
    }
}
