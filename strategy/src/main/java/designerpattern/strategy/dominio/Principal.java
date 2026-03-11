package designerpattern.strategy.dominio;

import designerpattern.strategy.strategy.ContextMath;
import designerpattern.strategy.strategy.Multiplicar;
import designerpattern.strategy.strategy.Somar;
import designerpattern.strategy.strategy.Subtrair;

public class Principal {

    public static void main(String[] args){

        // informando qual estratégia irá utilizar
        ContextMath math = new ContextMath(new Somar());
        System.out.println("Resultado da soma: "+math.calcular(5,8));

        //Mudando a estratégia
        math = new ContextMath(new Multiplicar());
        System.out.println("Resultado da Multiplicação: "+math.calcular(5,8));


        //Mudando a estratégia
        math = new ContextMath(new Subtrair());
        System.out.println("Resultado da Subtração: "+math.calcular(15,8));
    }
}
