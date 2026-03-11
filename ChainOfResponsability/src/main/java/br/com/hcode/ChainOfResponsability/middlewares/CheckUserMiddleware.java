package br.com.hcode.ChainOfResponsability.middlewares;

import br.com.hcode.ChainOfResponsability.server.Server;

public class CheckUserMiddleware extends  Middleware{
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }





    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("E-mail inválido");
            return false;
        }

        if(!server.isValidPassword(email, password)){
            System.out.println("E-mail ou Senha inválidos");
            return false;
        }
        return checkNest(email, password);
    }



}
