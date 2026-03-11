package br.com.hcode.adapter.adapters;

import br.com.hcode.adapter.payoneer.Payoneer;
import br.com.hcode.adapter.paypal.IPaypalPayments;
import br.com.hcode.adapter.utils.Token;


/*
    primeiramente preciso implementar a interface do paypal
 */
public class PayoneerAdapter implements IPaypalPayments {

    private Token token;
    private Payoneer payoneer;



    //construtor da classe adapatada
    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o payoneer utilizando o metodos padrões do paypal");
    }


    //metodos de paypal
    @Override
    public Token authToken() {
        return new Token();
    }

    //Então quando chamar os métodos do paypal
    // por debaixo dos panos estaram sendo chamados os metodos de payoneer
    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();

    }

    @Override
    public void paypalReceive() {
        this.payoneer.ReceivePayment();

    }
}
