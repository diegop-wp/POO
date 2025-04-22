package construtores.dominio;

public class Serie {
    private String tipo;
    private int ep;
    private String nome;
    private String genero;

    public Serie(int ep, String genero, String nome, String tipo) {
        this.ep = ep;
        this.genero = genero;
        this.nome = nome;
        this.tipo = tipo;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.ep);
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
