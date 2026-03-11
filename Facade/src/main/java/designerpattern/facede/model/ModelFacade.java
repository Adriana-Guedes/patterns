package designerpattern.facede.model;

import java.util.List;

public class ModelFacade {


    /*  A façade nesse caso só externizará essa classe que é uma lista
        Quem usar a aplicação só enxergara a camada façade
     */
    public static List<Cliente> listarTodosClientes(){
        return  Database.clientes;
    }

}
