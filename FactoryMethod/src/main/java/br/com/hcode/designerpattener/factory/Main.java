package br.com.hcode.designerpattener.factory;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {

        /* >>>>>> TIPO DE TRANSPORT: "uber", "log" ou "rappi" <<<<<<<<< */
        final String type = "eats";


        configure(type);
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.starTransport(); //
    }

    private static void configure(String type){
        if (type == null) {
            System.out.println("Tipo não definido no código.");
            return;
        }

        switch (type.toLowerCase()) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Tipo inválido no código: " + type + " (use: uber | log | rappi)");

        }
    }
}