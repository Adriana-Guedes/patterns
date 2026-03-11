package br.com.hcode.designerpattener.factory;

import br.com.hcode.designerpattener.factory.vehicles.Bike;
import br.com.hcode.designerpattener.factory.vehicles.IVehicle;

public class BikeTransport extends Transport{


    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
