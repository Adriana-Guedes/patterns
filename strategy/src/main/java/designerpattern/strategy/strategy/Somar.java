package designerpattern.strategy.strategy;

public class Somar implements StratagyMath {




    @Override
    public int operacao(int num1, int num2) {
        return num1 + num2;
    }


}
