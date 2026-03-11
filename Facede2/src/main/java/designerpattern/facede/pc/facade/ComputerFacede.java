package designerpattern.facede.pc.facade;

import designerpattern.facede.fabrica.Acessorios;
import designerpattern.facede.pc.fabrica.CPU;
import designerpattern.facede.pc.fabrica.HD;
import designerpattern.facede.pc.fabrica.Memoria;
import designerpattern.facede.pc.fabrica.SO;

public class ComputerFacede {
    private Memoria  memoria;
    private HD hd;
    private CPU cpu;
    private Acessorios acessorios;
    private SO so;


    //construtor com todas as instâncias para a construção do computador
    public ComputerFacede(){
        this.memoria = new Memoria();
        this.hd = new HD();
        this.cpu = new CPU();
        this.acessorios = new Acessorios();
        this.so = new SO();
    }


    //Todas as instâncias foram inseridas no construtor dessa classe
    public void montarPC(){
        System.out.println("Montando uma máquina...\n ");
        memoria.adicionarMemoria();
        hd.adicionarHD();
        cpu.adicionarProcessador();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();
        acessorios.adicionarMonitor();
        so.instalarSO();

        System.out.println("\nComputador Fábricado... ");

    }

}
