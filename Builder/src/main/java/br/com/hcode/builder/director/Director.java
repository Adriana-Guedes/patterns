package br.com.hcode.builder.director;


import br.com.hcode.builder.builders.IBuilder;
import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

// Ele chama os passos na sequência certa.
// Ele chama o construtor(builder) para a montagem do objeto, mas ele mesmo não sabe dos detalhes
// É o orquestrador, também sendo opcional
public class Director {


    //carro Sedam
    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setColor(Color.BRANCO);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }


    //carro Sport
    public void constructSportCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setColor(Color.AMARELO);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(2000));

    }

    //caminhão Toco

    public void constructTrukToco(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setColor(Color.PRETO);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(1200));
    }
}
