package br.com.hcode.designerpattener.abstractfactory.factories;

import br.com.hcode.designerpattener.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.designerpattener.abstractfactory.boats.IBoat;
import br.com.hcode.designerpattener.abstractfactory.landvehicles.ILandVehicle;


// dois metodos com base nas "interfaces"

public interface ITransportFactory {
    ILandVehicle createTransporteVehicle();
    IAircraft createTransporteAircraft();
    IBoat createTransportBoat();
}
