package designerpattern.obervers.observer1;

public class ConcretObserver extends  Observer{


    private ConcretSubject cs;

    public ConcretObserver(ConcretSubject cs){
        this.cs = cs;
        cs.attatch(this);

    }
    @Override
    public void update() {
        System.out.println("Observer notificado - Estado = "+cs.getState());

    }
}
