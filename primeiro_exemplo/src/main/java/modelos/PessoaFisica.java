package modelos;

public class PessoaFisica extends Pessoa{
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }

    @Override //isto mostra que este método é uma sobrescrita de metodo que no caso é do método do pai (classe Pessoa)//
    public void setNome(String nome){
        this.nome = "PF: = " + nome;
    }
  
}
