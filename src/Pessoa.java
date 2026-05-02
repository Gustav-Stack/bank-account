public class Pessoa{
    private String nome;
    private int idade;
    private double altura;
    private boolean ativo;


    //esse e o constructor
    public Pessoa(String nome, int idade, double altura){
        if(nome == null){
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.ativo = ativo;
    }

    //getters
    public void getName(){
        System.out.println("Nome:" + nome);
    }
    public void getIdade(){
        System.out.println("idade:" + idade);
    }
    public void getAltura(){
        System.out.println("Altura:" + altura);
    }
    public void isAtive(){
        System.out.println("Ativo:" + ativo);
    }

    //setters
    public void setName(String nome){
        if(nome == null){
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade <= -1){
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }
    public void setAltura(double idade){
        this.altura = altura;
    }
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }



}



