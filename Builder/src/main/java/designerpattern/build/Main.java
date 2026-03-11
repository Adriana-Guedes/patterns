package designerpattern.build;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         Não utiilzar construtores gigantescos assim
        Framework framework = new Framework(
                "My Project","mysql","root","root123",
                "localhost",true,true);

       ======================= ou ==================
         Isso é extremamente cansativo

        Framework framework = new Framework();
        framework.setName("My Project");
        framework.setDb("Mysql");
        framework.setDbUser("root");
        framework.setDbPassword("root123");
        framework.setDbHost("localhost");
        framework.setWebPack(true);
        framework.setTetes(true);
        framework.setFull(true);
         */




        Framework framework = new FrameworkFullBuilder().getFramework();

        framework.run();
    }
}