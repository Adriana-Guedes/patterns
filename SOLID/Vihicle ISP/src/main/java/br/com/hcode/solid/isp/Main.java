package br.com.hcode.solid.isp;


import br.com.hcode.solid.isp.vehicle.Car;
import br.com.hcode.solid.isp.vehicle.Motorcycle;


//Segregação de "interface"
public class Main {
    private static String type;

    public static void main(String[] args) {

         type = "Moto";
            if(type =="Car"){
                Car car = new Car("Rosa","2026",2.5,4);
            }else {
                Motorcycle motorcycle = new Motorcycle("Preto","2026",250);

        }

    }
}