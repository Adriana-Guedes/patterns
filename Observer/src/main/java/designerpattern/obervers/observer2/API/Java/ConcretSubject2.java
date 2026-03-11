package designerpattern.obervers.observer2.API.Java;
import java.util.Observable;


//extende de Observable de java.util
public class ConcretSubject2 extends Observable {

    private String state;



    public String getState() {

        return state;
    }


    public void setState(String state) {
        this.state = state;
        //verifica se o estado mudou, se mudou ele modifica
        //evita notificar mais de uma vez o estado sem modificações
        setChanged();
        notifyObservers(); // para notificar a modificação

    }




}
