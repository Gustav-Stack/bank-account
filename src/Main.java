public class Main {
    public static void main(String[] args){

        ContaBancaria contabancaria = new ContaBancaria("Gustavo",10);

        contabancaria.depositar(500);
        contabancaria.sacar(7);
        contabancaria.exibirSaldo();

        ContaBancaria contabancaria1 = new ContaBancaria("Juan",40);
        contabancaria1.depositar(2000);
        contabancaria1.sacar(359);
        contabancaria1.exibirSaldo();


    }
}