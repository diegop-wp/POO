package modificadorestatico.teste;

import modificadorestatico.dominio.Carro;

public class Programa {

    public static void main(String[] args) {

        Carro carro1 = new Carro("BMW", 300);
        Carro carro2 = new Carro("Ferrari",380);
        Carro carro3 = new Carro("posche",280);

        Carro.velocidademinima = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
