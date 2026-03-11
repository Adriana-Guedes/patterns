package br.com.hcode.designerpattener.abstractfactory.aircrafts;

public class Airplane implements IAircraft{

    @Override
    public void startRoute() {
        System.out.println("=============Transport Airplane =========================");
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
        System.out.println("=========================================================\n");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo. Vôo autorizado!");

    }

    @Override
    public void wind() {

        System.out.println("Ventos a 25km. Ventos ok!");

    }
}
