package SistemaBancarioLSP;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
