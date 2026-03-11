package designerpattern.obervers.observer2.API.Java;

import java.util.Observable;
import java.util.Observer;


//extende de Observer de java.util
public class ConcretObserver2 implements Observer {


    private ConcretSubject2 cs;

    public ConcretObserver2(ConcretSubject2 cs){
        this.cs = cs;
        cs.addObserver(this);
    }


    // Esse "update" vem na "interface" do Java Observer
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer notificado - Estado = "+cs.getState());


    }
}
