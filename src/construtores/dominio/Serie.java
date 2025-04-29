package construtores.dominio;

public class Serie {
    private String tipo;
    private int ep;
    private String nome;
    private String genero;
    private String estudio;

    public Serie(int ep, String genero, String nome, String tipo) {
        this();
        this.ep = ep;
        this.genero = genero;
        this.nome = nome;
        this.tipo = tipo;
    }
    public Serie(int ep, String genero, String nome, String tipo, String estudio){
        this(ep,genero,nome,tipo);
        this.estudio = estudio;
    }

    public Serie(){
      return;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.ep);
        System.out.println(this.estudio);
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
