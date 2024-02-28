package modelos;

public class Pessoa {
    protected String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public Pessoa (String nome){ //toda vez que alguem chamar pessoa tem que passar um nome, o programa não vai criar sozinho//
        this.nome = nome;
    }
    public Pessoa(){}//metodo construtor vazio para permitir criar um objeto sem criar nada,o java criar construtor sozinho//
}
