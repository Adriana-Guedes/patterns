package designerpattern.obervers.observer1;

public class ConcretSubject extends Subject{


    public String getState() {
        return state;
    }




    public void setState(String state) {
        this.state = state;
        notifyobserver(); // para notificar a modificação
    }

    private String state;


}
