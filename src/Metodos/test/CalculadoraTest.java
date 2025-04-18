package Metodos.test;

import Metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3};
        calculadora.somaDoisNumero();
        System.out.println("---");

        calculadora.subtraiDoisNumeros();
        System.out.println("---");

        // precisa de dois argumentos para executar
        calculadora.multiplicaDoisNumeros(1,1);

        calculadora.somaArrays(numeros);

    }
}
