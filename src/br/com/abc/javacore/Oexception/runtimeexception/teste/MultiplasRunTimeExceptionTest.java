package br.com.abc.javacore.Oexception.runtimeexception.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRunTimeExceptionTest {
    public static void main(String[] args) {
        try{
            talvezLanceException();
        }catch(SQLException | FileNotFoundException e){

        }


    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
