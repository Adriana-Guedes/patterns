package br.com.hcode.builder.builders;


import br.com.hcode.builder.cars.Truck;
import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;




//builder é o construtor do objeto, ou seja, um padrão
//builder onde está os detalhes da montagem
public class TruckBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Color color;



    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //construção do caminhão.
    public Truck getResult(){
        return new Truck(carType,color,seats,engine,transmission);

    }

}
