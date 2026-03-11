package br.com.hcode.solid.isp.vehicle;

public class Motorcycle implements IVhicle, IVehicleMotorcycle
{

    private String color;
    private String year;
    private double engine;





    public Motorcycle(String color, String year, double engine) {

        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        System.out.println("\n========== CRIANDO UMA MOTO =============");
        System.out.println("\n    Criando uma moto: " +color+ "\n    Ano: " +year+ "\n    Cilindradas: "+engine);
        startVehicle();



    }


    @Override
    public void startVehicle() {
        System.out.println("\n========== Ligando os Motores...==========");

    }
}
