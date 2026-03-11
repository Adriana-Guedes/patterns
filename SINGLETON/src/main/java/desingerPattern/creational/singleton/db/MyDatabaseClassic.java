package desingerPattern.creational.singleton.db;


import desingerPattern.creational.singleton.db.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;


//base de dados em memória
public class MyDatabaseClassic {
     private static MyDatabaseClassic instance; //precisa ser privada
     private List<Usuario> usuarios = new ArrayList<>();


    //construtor da classe precisa ser privado
    private MyDatabaseClassic(){

    }

    //esse é um singleton (mmesmo instancia),
    // cria uma instância caso ela não existir


    //getter para acessar a instância do banco, pois "new" é proibido
    public static MyDatabaseClassic getInstance() {
        if(instance == null){
            instance = new MyDatabaseClassic();
        }
        return instance;
    }


    // Método para criar o usuário e adicionar na lista
    public Usuario criarUsuario(Number id, String nome, Number idade) {
        Usuario novo = new Usuario(id, nome, idade);
        usuarios.add(novo);
        return novo;
    }



    // Remover usuário pelo ID
    public boolean removerUsuarioPorId(Number id) {
        return usuarios.removeIf(u -> u.getId().equals(id));
    }

    // Listar usuários
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }




}
