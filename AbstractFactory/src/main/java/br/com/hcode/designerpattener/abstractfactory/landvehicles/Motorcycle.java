package br.com.hcode.designerpattener.abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicle{
    @Override
    public void startRoute() {
        System.out.println("=============Transport Motorcycle=========================");
        getCargo();
        System.out.println("Estamos iniciando a entrega");
        System.out.println("=========================================================\n");
    }

    @Override
    public void getCargo() {
        System.out.println("\nJá pegamos a encomenda!");

    }
}
