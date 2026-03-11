package br.com.hcode.adapter.paypal;

import br.com.hcode.adapter.utils.Token;

public interface IPaypalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
