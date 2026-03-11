package br.com.hcode.solid.dip.factory;

import br.com.hcode.solid.dip.model.DB;
import br.com.hcode.solid.dip.model.IDbProduct;
import br.com.hcode.solid.dip.model.MongoDbProduct;
import br.com.hcode.solid.dip.model.MySQLProduct;

public class DBProductFactory {

    public static IDbProduct create(DB type) {
        if (type == DB.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDbProduct();
        }
    }
}
