package desingerPattern.creational.singleton.db.Usuario;

public class Usuario {


    public Number id;
    public String nome;
    public Number idade;


    public Usuario(Number id,String nome, Number idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }


    //getters and setters

    public Number getIdade() {
        return idade;
    }

    public void setIdade(Number idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "\nUsuario :" +
                ", id = " + id + ", " +
                ", nome = " + nome + "', " +
                ", idade = " + idade+"";
    }



}
