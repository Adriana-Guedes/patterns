package br.com.hcode.designerpattener.abstractfactory.landvehicles;

public class Car implements ILandVehicle{
    @Override
    public void startRoute() {
        System.out.println("=============Transport Car =============================");
        getCargo();
        System.out.println("Iniciando o trojeto");
        System.out.println("=========================================================\n");

    }

    @Override
    public void getCargo() {

        System.out.println("\nPegamos os passageiros! Estamos prontos");

    }
}
