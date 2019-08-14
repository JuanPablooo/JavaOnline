package br.com.abc.javacore.Npolimorfismo.classes;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("salvando dados nos arquivos");
    }
}
