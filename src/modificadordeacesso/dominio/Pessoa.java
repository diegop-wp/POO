package modificadordeacesso.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
}
