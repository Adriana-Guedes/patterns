package br.com.hcode.designerpattener.factory.vehicles;


//implementa os métodos e subsescreve conforme a especificidade da ação para esse objeto Motorcycle
public class Motorcycle implements IVehicle {


    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inicando a entrega");//após pegar a carga
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda");

    }
}
