package designerpattern.strategy;

import designerpattern.strategy.strategy.ContextMath;
import designerpattern.strategy.strategy.Multiplicar;
import designerpattern.strategy.strategy.Somar;
import designerpattern.strategy.strategy.Subtrair;


public class Main {
    public static void main(String[] args) {


        //Ele recebe uma estratégia no construtor
        ContextMath math = new ContextMath(new Somar());
        System.out.println("\nSoma resultado: "+math.calcular(5,3));


        math = new ContextMath(new Subtrair());
        System.out.println("Subtrair resultado: "+math.calcular(15,3));

        math = new ContextMath(new Multiplicar());
        System.out.println("Multiplicar resultado: "+math.calcular(5,3));







    }
}