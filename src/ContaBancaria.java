public class ContaBancaria {
    String titular;
    double saldo;
    int numeroConta;

    public ContaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    void depositar(double valor){
        saldo += valor;
        System.out.println("===============================");
        System.out.println("Numero da conta:" +numeroConta);
        System.out.println("Nome do Titular:" +titular);
        System.out.println("Valor atualizado: "+ saldo);
        System.out.println("===============================");
    };

    void sacar(double valor){
        saldo -= valor;
        System.out.println("===============================");
        System.out.println("Numero da conta:" +numeroConta);
        System.out.println("Nome do Titular:" +titular);
        System.out.println("Valor atualizado: "+ saldo);
        System.out.println("===============================");
    }

    void exibirSaldo(){
        System.out.println("===============================");
        System.out.println("Numero da conta:" +numeroConta);
        System.out.println("Nome do Titular:" +titular);
        System.out.println("Valor Atual: "+saldo);
        System.out.println("===============================");
    }

}
