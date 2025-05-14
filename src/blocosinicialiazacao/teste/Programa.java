package blocosinicialiazacao.teste;

import blocosinicialiazacao.dominio.Filme;

public class Programa {
    public static void main(String[] args) {

        Filme filme = new Filme();

        for (int episodio: filme.getEp()) {
            System.out.print(episodio + " ");
        }


    }
}
