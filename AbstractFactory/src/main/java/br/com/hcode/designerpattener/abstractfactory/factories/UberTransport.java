package br.com.hcode.designerpattener.abstractfactory.factories;

import br.com.hcode.designerpattener.abstractfactory.aircrafts.Airplane;
import br.com.hcode.designerpattener.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.designerpattener.abstractfactory.boats.Boat;
import br.com.hcode.designerpattener.abstractfactory.boats.IBoat;
import br.com.hcode.designerpattener.abstractfactory.landvehicles.Car;
import br.com.hcode.designerpattener.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransporteVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransporteAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
