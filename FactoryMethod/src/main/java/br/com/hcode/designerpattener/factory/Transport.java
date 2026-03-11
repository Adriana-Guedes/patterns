package br.com.hcode.designerpattener.factory;

import br.com.hcode.designerpattener.factory.vehicles.IVehicle;

/*  Transport (factory abstrata)
 *  factory programada direcionada a "interface",
 *  realiza o método de fábrica para criação do objeto createVehicle.
 *  classe generica para a criação do objeto sem "instanciamento"
 *  múltiplos tipos de produto coerentes entre si (famílias).
 *  a criação desse objeto será em suas subclasses
 */
public abstract class Transport {
    void starTransport(){
        IVehicle vechicle = createTransport();
        vechicle.startRoute();

    }

    //metodos com base na "interface"
    protected abstract IVehicle createTransport();
}
