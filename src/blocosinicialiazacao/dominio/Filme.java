package blocosinicialiazacao.dominio;

public class Filme {
    private String nome;
    private int [] ep  = {1, 2, 3, 4, 5, 6, 7, 8};
    {
        System.out.println("dentro bloco de inicialização");
        ep  = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i+1;
        }
    }
    public Filme(String nome) {
        this.nome = nome;
    }

    public Filme() {

        for (int eps : this.ep){
            System.out.print(eps+" ");
        }
        System.out.println();
    }

    public int[] getEp() {
        return ep;
    }

    public String getNome() {
        return nome;
    }
}
