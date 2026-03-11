package br.com.hcode.solid.isp.vehicle;


//Posso IMPLEMENTAR mais de uma "interface"
public class Car implements IVhicle,IVehicleCar{
    private String color;
    private String year;
    private double engine;
    private int seats;



    //construtor
    public Car(String color, String year, double engine, int seats) {

        configureCar(color, year, engine, seats);
    }



    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("\n========== CRIANDO UM CARRO =============");
        System.out.println("\n    Cilindradas: "+engine+"\n    Cor: "+color+ "\n    Ano: "+year+"\n    Qtde Assentos: "+seats );

        startVehicle();
    }


    @Override
    public void startVehicle() {
        System.out.println("\n========== Ligando os Motores...==========");


    }
}
