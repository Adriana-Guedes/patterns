package br.com.hcode.builder.builders;

import br.com.hcode.builder.cars.Car;
import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;



//builder é o construtor do objeto, ou seja, um padrão
//builder onde está os detalhes da montagem
public class CarBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Color color;




    //setters
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
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

    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    //construção do carrto
    public Car getResult(){
        return new Car(carType,color,seats,engine,transmission);

    }
}
