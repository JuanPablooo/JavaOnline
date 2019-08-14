package br.com.abc.javacore.Hheranca.testes;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class TestaHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("jubileu");
        p.setCpf("464646");

        Endereco ende = new Endereco();
        ende.setRua("jose de aumeirda");
        ende.setBairro("litorondia");
        p.setEndereco(ende);

        Funcionario func = new Funcionario();
        func.setNome("fabio");
        func.setCpf("6564118");
        func.setSalario(999);
        func.setEndereco(ende);
    }
}
