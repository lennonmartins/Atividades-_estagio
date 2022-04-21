public class Conta {
    String nomeTitular;
    int numeroConta;
    String agencia;
    double saldo;
    Data dataAbertura;
    double novoSaldo;
    double rendimento;
    String texto;

    double sacar(double valorDeSaque) {
        novoSaldo = this.saldo - valorDeSaque;
        this.saldo = novoSaldo;
       return this.saldo;
    }

    double depositar(double valorDeDeposito){
        novoSaldo = saldo + valorDeDeposito;
        this.saldo = novoSaldo;
        return this.saldo;
    }

    double calcularRendimento(){
        this.rendimento = saldo*0.1;
        this.saldo += this.rendimento;
        return rendimento;
    }

    String recuperarDadosParaImpressao(){
        texto = "Titula: " + this.nomeTitular + " / Agencia "+ agencia + " / Saldo: " +  String.format("%.2f", saldo);
        return texto;
    }

    

}
