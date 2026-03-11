package designer_patterns;

import designer_patterns.vihicles.Car;
import designer_patterns.vihicles.Motorcycle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static TyperVihecle typerVihecle;

    public static void main(String[] args) {
        typerVihecle = TyperVihecle.CAR;


        if (typerVihecle == TyperVihecle.CAR){
            Car car = new Car("Azul", "2022", 2.6, 4);

        } else if (typerVihecle ==TyperVihecle.MOTORCLYCLE) {
            Motorcycle motorcycle = new Motorcycle("Branco","2026",250 );
            
        }

    }
}