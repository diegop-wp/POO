package blocosinicialiazacao.dominio;

public class Filme {
    private String nome;
    private int [] ep  = {1, 2, 3, 4, 5, 6, 7, 8};

    public Filme() {

        for (int eps : ep){
            System.out.println(eps+" ");
        }
    }
}
