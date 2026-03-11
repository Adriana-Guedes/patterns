package designer_patterns.vihicles;

public class Motorcycle extends Vihicle{

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine= engine;
        configureMotorcycle();

    }

    public void configureMotorcycle(){
        System.out.println("Criando uma moto: "+"\nAno: " +year+ "\nMotor: " +engine+ " cilindradas");


        starVehicle(); //chamando da classe base

    }
}
