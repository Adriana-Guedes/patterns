package br.com.hcode.designerpattener.abstractfactory.factories;

import br.com.hcode.designerpattener.abstractfactory.aircrafts.Helicopter;
import br.com.hcode.designerpattener.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.designerpattener.abstractfactory.boats.Boat;
import br.com.hcode.designerpattener.abstractfactory.boats.IBoat;
import br.com.hcode.designerpattener.abstractfactory.landvehicles.ILandVehicle;
import br.com.hcode.designerpattener.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransporteVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransporteAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }


}
