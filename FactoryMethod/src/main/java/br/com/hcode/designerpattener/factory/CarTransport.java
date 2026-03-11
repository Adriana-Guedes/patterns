package br.com.hcode.designerpattener.factory;


import br.com.hcode.designerpattener.factory.vehicles.Car;
import br.com.hcode.designerpattener.factory.vehicles.IVehicle;

//CarTransport (factory concreta)
// aqui extendemos a classe abstrata e instanciamos a classe Car
public class CarTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
