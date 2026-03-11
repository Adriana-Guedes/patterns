package br.com.hcode.designerpattener.factory.vehicles;



//implementa os métodos e subsescreve conforme a especificidade da ação para esse objeto Car
public class Car implements IVehicle {



    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto"); //após pegar os passageiros ou carga

    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros! Estamos prontos");

    }
}
