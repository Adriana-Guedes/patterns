package designerpattern.strategy.strategy;

public class Multiplicar implements StratagyMath{
    @Override
    public int operacao(int num1, int num2) {
        return num1 * num2;
    }
}
