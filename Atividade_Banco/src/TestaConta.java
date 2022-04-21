public class TestaConta {
    public static void main(String[] args) throws Exception {
        Conta contaLennon = new Conta();
        contaLennon.saldo = 500;
        contaLennon.nomeTitular = "Lennon Martins";
        contaLennon.agencia = " 78459-1 ";

        contaLennon.sacar(120);
        System.out.println(String.format("%.2f", contaLennon.novoSaldo));

    
        contaLennon.depositar(200);
        System.out.println(String.format("%.2f", contaLennon.novoSaldo));

        contaLennon.calcularRendimento();
        System.out.println("Seu dinheiro guardado rendeu R$ " + String.format("%.2f",contaLennon.rendimento) + " esse mês. Seu novo saldo é de: R$ " + contaLennon.saldo);

        System.out.println(contaLennon.recuperarDadosParaImpressao());
        }
}
