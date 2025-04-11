package Classes.teste;

import Classes.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Mclaren";
        carro.modelo = "765lt";
        carro.ano = 2020;

        System.out.println(carro.nome + "\n" + carro.modelo + "\n"+ carro.ano);
    }

}
