package br.com.hcode.designerpattener.abstractfactory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        System.out.println("=============Transport Helicopter=========================");
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
        System.out.println("=========================================================\n");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok. Ligando hélices");
    }

    @Override
    public void wind() {
        System.out.println("\nVentos 25km, Suldeste. Ventos ok!");

    }
}
