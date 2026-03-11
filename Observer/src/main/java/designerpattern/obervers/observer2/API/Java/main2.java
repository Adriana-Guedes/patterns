package designerpattern.obervers.observer2.API.Java;

import designerpattern.obervers.observer1.ConcretObserver;
import designerpattern.obervers.observer1.ConcretSubject;

public class main2 {

        public static void main(String[] args) {

            ConcretSubject s = new ConcretSubject();

            ConcretObserver o1 = new ConcretObserver(s);
            ConcretObserver o2 = new ConcretObserver(s);

            // setando o estado
            s.setState("Novo Estado 1");
            s.setState("Novo Estado 2");


        }
}
