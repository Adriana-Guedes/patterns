package desingerPattern.creational.singleton.db;


import desingerPattern.creational.singleton.db.MyDatabaseClassic;

public class Teste {
    public static void main(String[] args) {


        //singleton
        MyDatabaseClassic db1 = MyDatabaseClassic.getInstance();
        MyDatabaseClassic db2 = MyDatabaseClassic.getInstance();


        // um problema setar "id" na mão aqui já é um problema sério, pois haverá repetição,
        //porém será criado apenas uma instância, não importa se chamamos db1 ou db2
        //a lista será única

        db1.criarUsuario(1,"Adriana",43);
        db1.criarUsuario(2,"Claudia",27);
        db1.criarUsuario(3,"Fernando",10);
        db1.criarUsuario(4,"Pedro",38);


        db1.criarUsuario(1,"Joecy",57);
        db1.criarUsuario(2,"Vitor",49);
        db1.criarUsuario(3,"Solange",15);
        db1.criarUsuario(4,"Amaral",8);



        //mesma instancia/ mesma lista/apenas um ponto de acesso
        System.out.println("===============LISTA DE USUARIO db1=====================");
        System.out.println(" Usuários : "+ db1.listarUsuarios());
        System.out.println("\n===============LISTA DE USUARIO db2=====================");
        System.out.println(" Usuários : "+ db2.listarUsuarios());






        //singleton controla a instancia não a variavel
        System.out.println("\ndb1 - contem: " + db1.listarUsuarios().size() + " usuário"); //deve contar 1 usuario
        System.out.println("db2 - contem: " + db2.listarUsuarios().size()  + " usuário, por se tratar da mesma instancia"); //mesma lista
        System.out.println("\nMesma Instância? :" +(db1 == db2)); // mesma instancia?


        System.out.println("==============REMOÇÃO======================");
        db1.removerUsuarioPorId(1);
        System.out.println(" Usuários : "+ db1.listarUsuarios());

    }
}