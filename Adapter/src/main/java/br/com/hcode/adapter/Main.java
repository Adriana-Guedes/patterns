package br.com.hcode.adapter;

import br.com.hcode.adapter.adapters.MercadoPagoAdapter;
import br.com.hcode.adapter.adapters.PayoneerAdapter;
import br.com.hcode.adapter.mercadopago.IMercadoPagoPayments;
import br.com.hcode.adapter.mercadopago.MercadoPago;
import br.com.hcode.adapter.payoneer.Payoneer;
import br.com.hcode.adapter.paypal.IPaypalPayments;
import br.com.hcode.adapter.paypal.Paypal;

/*
    o que ocorre aqui. o metodo payment não pode alterar os objetos quando vai para Payoneer
    Mas os metodos do payoneer tem nomes diferentes do Paypal.
    Ai que entra os adapters
 */

public class Main {
    public static void main(String[] args) {
        /*
         Para não quebrar toda a aplicação eu só adapto o novo objeto
         para reutilizar os mesmos metodos do objeto anterior
         isso evita quebrar a aplicação
         */

        /*
        ============ PAYPAL==================
        IPaypalPayments payments = new Paypal();
        payments.paypalPayment();
        payments.paypalReceive();
        */

        /*
        // ============ PAYONEER==================
        IPaypalPayments payments = new PayoneerAdapter(new Payoneer());
        payments.paypalPayment();
        payments.paypalReceive();

        */

        // com isso não será necessário trocar nomes apenas adaptar o acesso da outra classe por debaixo por panos
        IPaypalPayments payments = new MercadoPagoAdapter(new MercadoPago());
        payments.paypalPayment();
        payments.paypalReceive();

        }


}