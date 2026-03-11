package br.com.hcode.designerpattener.abstractfactory.app;

import br.com.hcode.designerpattener.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.designerpattener.abstractfactory.boats.IBoat;
import br.com.hcode.designerpattener.abstractfactory.factories.ITransportFactory;
import br.com.hcode.designerpattener.abstractfactory.landvehicles.ILandVehicle;


//chamada será realizado no main

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;




    //informando o tipo e o factory que será criado
    public Application(ITransportFactory factory){
        vehicle = factory.createTransporteVehicle();
        aircraft = factory.createTransporteAircraft();
        boat = factory.createTransportBoat();
    }


    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }

}
