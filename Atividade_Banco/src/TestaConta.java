public class TestaConta {
    public static void main(String[] args) throws Exception {
        Conta contaLennon = new Conta();
        contaLennon.saldo = 500;
        contaLennon.nomeTitular = "Lennon Martins";
        contaLennon.agencia = " 78459-1 ";
    

        Conta contaDanilo = new Conta();
        //contaDanilo.saldo = 500;
        //contaDanilo.nomeTitular = "Lennon Martins";
        //contaDanilo.agencia = " 78459-1 ";

        contaDanilo = contaLennon;

        if (contaDanilo == contaLennon){
            System.out.println("Contas Iguais");
        } else {
            System.out.println("Contas diferentes");
        }

        contaLennon.sacar(120);
        System.out.println(String.format("%.2f", contaLennon.novoSaldo));

    
        contaLennon.depositar(200);
        System.out.println(String.format("%.2f", contaLennon.novoSaldo));

        contaLennon.calcularRendimento();
        System.out.println("Seu dinheiro guardado rendeu R$ " + String.format("%.2f",contaLennon.rendimento) + " esse mês. Seu novo saldo é de: R$ " + contaLennon.saldo);

        System.out.println(contaLennon.recuperarDadosParaImpressao());
        }
}
