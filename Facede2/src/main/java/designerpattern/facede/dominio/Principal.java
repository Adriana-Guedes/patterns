package designerpattern.facede.dominio;

import designerpattern.facede.fabrica.Acessorios;
import designerpattern.facede.pc.fabrica.CPU;
import designerpattern.facede.pc.fabrica.HD;
import designerpattern.facede.pc.fabrica.Memoria;
import designerpattern.facede.pc.fabrica.SO;
import designerpattern.facede.pc.facade.ComputerFacede;

public class Principal {


    public static void main(String[] args){

        //com apenas essa classe agora é possivel construtir o computador
        //sem a necessidade de vários instânciamentos
        // para a construção de um objeto
        ComputerFacede computerFacede = new ComputerFacede();
        computerFacede.montarPC();

    }
}
