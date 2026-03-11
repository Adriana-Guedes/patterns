package designerpattern.obervers.observer1;


import java.util.ArrayList;
import java.util.List;

//Tem uma lista de observer
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();



    //metodo para adicionar o observer na lista
    public void attatch(Observer o){
        this.observers.add(o);
    }


    //metodo para retirar da lista
    public void detach(Observer o){
        this.observers.remove(o);
    }



    //para update de observer
    public void notifyobserver(){
        for (Observer observer : observers) {
            observer.update();

        }
    }
}
