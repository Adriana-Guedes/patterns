package br.com.hcode.designerpattener.factory;


import br.com.hcode.designerpattener.factory.vehicles.IVehicle;
import br.com.hcode.designerpattener.factory.vehicles.Motorcycle;

//CarTransport (factory concreta)
// aqui podemos implementar a classe Motorcycle
public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
