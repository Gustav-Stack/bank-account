public class Main {
    public static void main(String[] args){

//        ContaBancaria contabancaria = new ContaBancaria("Gustavo",10);
////
////        contabancaria.depositar(500);
////        contabancaria.sacar(7);
////        contabancaria.exibirSaldo();
////
////        ContaBancaria contabancaria1 = new ContaBancaria("Juan",40);
////        contabancaria1.depositar(2000);
////        contabancaria1.sacar(359);
////        contabancaria1.exibirSaldo();

//        Pessoa pessoa = new Pessoa("Gustavo", 23, 1.75);
//        pessoa.setIdade(23);
//        pessoa.getIdade();

        Produto produto = new Produto("cafe", 13.75, 3);

        produto.vender(2);
        produto.repor(10);

        produto.getEstoque();

//        Testando funcionamento do private
//        produto.nome ="sabão";

        Produto produto1 = new Produto("Tomate o kg", 10.00, 5);

        produto1.vender(4);
        produto1.repor(50);

        produto1.getEstoque();


    }
}