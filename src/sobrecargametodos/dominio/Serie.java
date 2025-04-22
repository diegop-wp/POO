package sobrecargametodos.dominio;

public class Serie {
    private String tipo;
    private int ep;
    private String nome;
    private String genero;


    public void init (String nome, String tipo , int ep ){
    this.nome = nome;
    this.tipo = tipo;
    this.ep = ep;
    }
    public void init (String nome, String tipo , int ep, String genero ){
        this.init(nome,tipo,ep);
        this.genero = genero;
    }

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.ep);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
