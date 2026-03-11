package br.com.hcode.adapter.mercadopago;

import br.com.hcode.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {


    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void pagoPayment() {
        System.out.println("Enviando pagamentos via Mercado Pago");

    }

    @Override
    public void pagoReceive() {
        System.out.println("Recebendo pagamentos via Mercado Pago");

    }
}
