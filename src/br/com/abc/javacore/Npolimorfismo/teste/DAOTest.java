package br.com.abc.javacore.Npolimorfismo.teste;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("lista1");
        lista.add("lista2");
        lista.add("lista3");
        lista.add("lista4");
        for (String lis:lista){
            System.out.println(lis);
        }

    }
}
