package br.com.hcode.designerpattener.factory.vehicles;



//implementa os métodos e subsescreve conforme a especificidade da ação para esse objeto Bike
public class Bike implements IVehicle{



    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o delivery");

    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida");

    }
}
