package designerpattern.strategy.strategy;


//classe de contexto
public class ContextMath {

      // precisa ter um objeto do tipo strategy
    private StratagyMath stratagy;



    //construtor do tipo stratagy
    public ContextMath(StratagyMath stratagy) {
        this.stratagy = stratagy;
    }



    //chama a função sem implementar a "interface"
    public int calcular( int num1, int num2){
        return stratagy.operacao(num1,num2);
    }

}
