package modificadordeacesso.test;

import modificadordeacesso.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Diego");
        pessoa.setIdade(21);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
