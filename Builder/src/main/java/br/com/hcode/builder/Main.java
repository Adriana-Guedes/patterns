package br.com.hcode.builder;

import br.com.hcode.builder.builders.CarBuilder;
import br.com.hcode.builder.builders.TruckBuilder;
import br.com.hcode.builder.cars.Car;
import br.com.hcode.builder.cars.Truck;
import br.com.hcode.builder.director.Director;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        String traco = "================ ";
        String titulo =  " CRIADO COM SUCESSO ";
        String divisao =  "==============================================================\n";


        //Criando um objeto car

        //Chamada do construtor do carro
        CarBuilder builder = new CarBuilder();
        // Orquestrador. Executa o passo a passo para a criação do objeto
        director.constructSedanCar(builder);

        //Para visualizar a criação
        Car car = builder.getResult();

        System.out.println("\n"+traco+"CARRO"+titulo+traco+"\n");
        System.out.println(car.result());
        System.out.println(divisao);



        //Criando um objeto caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTrukToco(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("\n"+traco+"CAMINHÃO"+titulo+traco+"\n");
        System.out.println(truck.result());
        System.out.println(divisao);



        //Chamada do construtor do carro sport
        CarBuilder bSport = new CarBuilder();
        director.constructSportCar(bSport);

        //Para visualizar a criação
        Car carSport = bSport.getResult();

        System.out.println("\n"+traco+"CARRO"+titulo+traco+"\n");
        System.out.println(carSport.result());
        System.out.println(divisao);

 




    }
}