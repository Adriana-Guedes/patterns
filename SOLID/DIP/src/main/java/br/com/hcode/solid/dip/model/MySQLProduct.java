package br.com.hcode.solid.dip.model;

public class MySQLProduct implements IDbProduct{


    //classe baixo nível
    public String getProductById(String productID){
        return "Mysql:Exibindo dados do Produto " + productID;
    }
}
