import java.util.Scanner;

public class Exc34 {
    public static void main(String[] args) {
        double porcentagemIpi;
        int codigoPeca1;
        double valorPeca1;
        int quantidadePeca1;
        int codigoPeca2;
        double valorPeca2;
        int quantidadePeca2;
        double valorTotal;
        

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a porcentagem do IPI: ");
        porcentagemIpi = leitor.nextDouble();

        System.out.println("Informe código da peça 1: ");
        codigoPeca1 = leitor.nextInt();
       
        System.out.println("Informe o valor da peça 1: ");
        valorPeca1 = leitor.nextDouble();
        
        System.out.println("Informe a quantidade da peça 1 que você deseja adquirir: ");
        quantidadePeca1 = leitor.nextInt();
        
        System.out.println("Informe código da peça 2: ");
        codigoPeca2 = leitor.nextInt();
       
        System.out.println("Informe o valor da peça 2: ");
        valorPeca2 = leitor.nextDouble();
        
        System.out.println("Informe a quantidade da peça 2 que você deseja adquirir: ");
        quantidadePeca2 = leitor.nextInt();

        valorTotal =  (valorPeca1*quantidadePeca1 + valorPeca2*quantidadePeca2)*(porcentagemIpi/100 + 1);

        System.out.println("O total a ser pago será de: R$ " + String.format("%.2f", valorTotal));


    }
}
