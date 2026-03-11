package br.com.hcode.designerpattener.abstractfactory.boats;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        System.out.println("=============Transport Boat=============================");
        seaTest();
        getCargo();
        System.out.println("Iniciando a viagem");
        System.out.println("=========================================================\n");
    }

    @Override
    public void getCargo() {
        System.out.println("Mercadoria a bordo!");

    }

    @Override
    public void seaTest() {
        System.out.println("Condições para embarcação Ok!");

    }
}
