package br.com.hcode.solid.dip.payment;

import br.com.hcode.solid.dip.factory.DBProductFactory;
import br.com.hcode.solid.dip.model.DB;
import br.com.hcode.solid.dip.model.IDbProduct;
import br.com.hcode.solid.dip.model.MySQLProduct;

//classe de alto nível
public class Payment {
    public void pay(String produtcID){
        //MySQLProduct dbProduct = new MySQLProduct();
        /*
        Trocando o vinculo direto do banco de dados por uma "interface"
        que só chama o banco(qual não importa) e uma classe que chama os bancos de dados.
         */
        IDbProduct dbProduct = DBProductFactory.create(DB.MONGODB); //Metodo statico pode ser chamado direto
        String product = dbProduct.getProductById(produtcID);
        System.out.println(product);
    }
}
