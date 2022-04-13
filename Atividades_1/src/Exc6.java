import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        // area => A=b.h
        // perímetro => (2b+2h)

        double largura = 5.5;
        double altura = 8.5;
        double area;
        double perimetro;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a largura do retangulo: ");
        largura = leitor.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        altura = leitor.nextDouble();
        
        area = largura*altura;
        System.out.println("A área do retângulo tem valor: " + area);

        perimetro = ((2*largura)+(2*altura));
        System.out.println("O perímetro do retângulo tem valor: " + perimetro);

        leitor.close();
    }
}
