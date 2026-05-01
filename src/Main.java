public class Main {
    public static void main(String[] args){

        ContaBancaria contabancaria = new ContaBancaria("Gustavo",10);

        contabancaria.depositar(10);
        contabancaria.sacar(5);
        contabancaria.exibirSaldo();

        ContaBancaria contabancaria1 = new ContaBancaria("Juan",40);
        contabancaria1.depositar(10);
        contabancaria1.sacar(5);
        contabancaria1.exibirSaldo();


    }
}