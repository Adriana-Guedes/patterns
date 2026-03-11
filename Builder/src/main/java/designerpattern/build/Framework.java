package designerpattern.build;

public class Framework {

    private String name;
    private String db;
    private String dbUser;
    private String dbPassword;
    private String dbHost;
    private boolean webPack;
    private boolean tetes;
    private boolean full;



    /* Usar em caso de construtores gigantes
    //construtor
    public Framework(
            String name, String db, String dbUser, String dbPassword,
            String dbHost, boolean webPack, boolean full) {
        this.name = name;
        this.db = db;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbHost = dbHost;
        this.webPack = webPack;
        this.full = full;
    }

*/



    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public boolean getWebPack() {
        return webPack;
    }

    public void setWebPack(boolean webPack) {
        this.webPack = webPack;

    }

    public boolean getTestes() {
        return tetes;
    }

    public void setTestes(boolean testes) {
        this.tetes = testes;
    }

    public boolean getFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }


    public void run(){
        System.out.println("\nPROJETO CONSTRUIDO! ");
    }

}
