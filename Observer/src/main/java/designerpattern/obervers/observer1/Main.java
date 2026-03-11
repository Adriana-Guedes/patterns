package designerpattern.obervers.observer1;


public class Main {
    public static void main(String[] args) {

    ConcretSubject s = new ConcretSubject();

    Observer o1 = new ConcretObserver(s);
    Observer o2 = new ConcretObserver(s);


   // setando o estado
   s.setState("Novo Estado 1");
   s.setState("Novo Estado 2");


    }


}