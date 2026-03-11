package br.com.hcode.bridge.platforms;

public class DineyPlus implements IPlatform {


    public DineyPlus(){
        configureRMTP();
        System.out.println("Disney Plys:Transmissão Iniciada.");
    }


    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Disney Plys: Conta Autorizada.");

    }

    @Override
    public void authToken() {
        System.out.println("Disney Plys: Autorizando Aplicação.");

    }
}
