package br.com.hcode.builder.cars;

import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

public class Truck {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;




    //Construtor
    public Truck(CarType carType, Color color, int seats, Engine engine, Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public Color getColor(){
        return color;
    }



   public String result(){
        String truck =
                "CAMINHÃO: "+carType+ "\n"+
                "COLOR: "+color+ "\n"+
                "MOTOR : "+ engine.getPower()+ "\n"+
                "ASSENTO: "+seats+ "\n"+
                "TRANSMISSÃO: "+transmission;

        return truck;
   }

}
