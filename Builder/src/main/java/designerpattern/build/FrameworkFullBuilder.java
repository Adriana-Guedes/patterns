package designerpattern.build;


/* Ela é responsável para configurar a classe base
 e criar o objeto
 Aqui você faz métodos que fazem pedaços de código
 em alguns casos quando se esta trabalhando, os métodos precisam seguir uma ordem*/
public class FrameworkFullBuilder implements IBuilder {

    Framework framework;

/* ESSA É UMA OPÇÃO
    CONSTRUTOR PODE SER FEITO DESSA MANEIRA OU,

    public FrameworkFullBuilder ( ){
        this.framework = new Framework();
        System.out.println("\n===== INICIANDO CONSTRUÇÃO DE PROJETO =======");
        framework.setName("My Project");
        System.out.println("NOME DO PROJETO: "+framework.getName());
        framework.setDb("Mysql");
        System.out.println("DATABASE: "+framework.getDb());
        framework.setDbUser("root");
        System.out.println("DB USER: "+framework.getDbUser());
        framework.setDbPassword("root123");
        System.out.println("DB PASSWORD: "+framework.getDbPassword());
        framework.setDbHost("localhost");
        System.out.println("DB HOST: "+framework.getDbHost());
        framework.setWebPack(true);
        System.out.println("WEB PACK: "+framework.getWebPack());
        framework.setTestes(true);
        System.out.println("TESTES: "+framework.getTestes());
        framework.setFull(true);
        System.out.println("FULL: "+framework.getFull());
    }


 */

 //OU CONSTRUTOR TAMBÉM CHAMANDO CADA ITÉM COMO FUNÇÃO
    //PODE SER FEITO DE DIVERSAS MANEIRAS
    //AQUI CRIAMOS VÁRIOS MÉTODOS E CHAMA-LOS NO CONSTRUTOR NA ORDEM NECESSÁRIA
    public FrameworkFullBuilder ( ) {
        this.framework = new Framework();
        buildName();
        buildDB();
        buildWebpack();
        buildTestes();
        buildFull();
    }



    /*====================== MÉTODOS A SEREM CHAMADOS ========================*/
    @Override
    public  void buildName(){
        System.out.println("\n===== INICIANDO CONSTRUÇÃO DE PROJETO =======");
        framework.setName("My Project");
        System.out.println("NOME DO PROJETO: "+framework.getName());

    }
    @Override
    public void buildDB(){
        framework.setDb("Mysql");
        System.out.println("DATABASE: "+framework.getDb());
        framework.setDbUser("root");
        System.out.println("DB USER: "+framework.getDbUser());
        framework.setDbPassword("root123");
        System.out.println("DB PASSWORD: "+framework.getDbPassword());
        framework.setDbHost("localhost");
        System.out.println("DB HOST: "+framework.getDbHost());
    }

    @Override
    public void buildWebpack(){
        System.out.println("WEB PACK: "+framework.getWebPack());
        framework.setTestes(true);
    }

    @Override
    public void buildTestes(){
        System.out.println("TESTES: "+framework.getTestes());
        framework.setFull(true);
    }

    @Override
    public void buildFull(){
        framework.setFull(true);
        System.out.println("FULL: "+framework.getFull());

    }





    private String name;
    private String db;
    private String dbUser;
    private String dbPassword;
    private String dbHost;
    private boolean webPack;
    private boolean tetes;
    private boolean full;

    //
    public Framework getFramework() {
        return framework;
    }
}
