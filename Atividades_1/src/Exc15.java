import java.util.Scanner;

public class Exc15 {
    public static void main(String[] args) {
        String senha; 

        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe sua senha: ");
        senha = leitor.nextLine();

        System.out.println("Sua senah era: " + senha);

        leitor.close();

    }
}
