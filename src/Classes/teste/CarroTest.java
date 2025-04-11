package Classes.teste;

import Classes.dominio.Carro;
import Classes.dominio.ImpressoraCarro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        ImpressoraCarro impressoraCarro = new ImpressoraCarro();

        carro.nome = "Mclaren";
        carro.modelo = "765lt";
        carro.ano = 2020;

        carro2.nome = "BMW";
        carro2.modelo = "M8";
        carro2.ano = 2024;

        impressoraCarro.imprime(carro);

        impressoraCarro.imprime(carro2);


    }

}
