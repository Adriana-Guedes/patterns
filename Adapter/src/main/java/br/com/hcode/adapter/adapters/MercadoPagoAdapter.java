package br.com.hcode.adapter.adapters;

import br.com.hcode.adapter.mercadopago.MercadoPago;
import br.com.hcode.adapter.paypal.IPaypalPayments;
import br.com.hcode.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {


    private Token token;
    private MercadoPago mercadoPago;

    //construtor da classe adapatada
    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o payoneer utilizando o metodos padrões do Mercado Pago");
    }




    @Override
    public Token authToken() {
        return new Token();
    }



    @Override
    public void paypalPayment( ) {
        this.mercadoPago.pagoPayment();


    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.pagoPayment();

    }
}
