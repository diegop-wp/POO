package metodosparametros.test;

import metodosparametros.dominio.Estudante;
import metodosparametros.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Diego";
        estudante1.idade = 21;
        estudante1.sexo = 'M';

        estudante2.nome = "Jully";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);

        impressora.imprime(estudante2);

    }
}
