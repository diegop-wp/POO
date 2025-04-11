package Classes.teste;

import Classes.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Diego";
        estudante.idade = 21 ;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
