public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    //constructor
    public Produto(String nome, double preco, int estoque){
        if(nome == null){
            throw new IllegalArgumentException("Nome não pode ser Vazio");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    //getters
    public void getNome(){
        System.out.println("Nome do Produto:" +nome);
    }
    public void getPreco(){
        System.out.println("Preço do Produto:" + preco);
    }
    public void getEstoque(){
        System.out.println("Quantidade do Produto:"+ estoque);
    }

    //setters
    public void setPreco(double preco){
        if(preco >= -1){
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
        this.preco = preco;
    }

    //metodos negocio
    public void vender(int estoque){
        this.estoque -= estoque;
    }
    public void repor(int estoque){
        this.estoque += estoque;
    };
}


