package SistemaBancarioLSP;

public class MainPayment {

    /* Programação orientada a ‘interface’.
     * Não importa quantas classes de objetos eu inserir.
     * As classes independem uma das outras quando são parecidas
    */
    public static void main(String[] args) throws Exception {

        /*CreditCard card = new CreditCard();
        **DebitCard card  = new DebitCard();  */
        NubankRewards card = new NubankRewards();

        card.validate();
        card.collectPayment();

    }
}
