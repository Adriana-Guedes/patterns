package designerpattern.proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //sem proxy
           Image i = new Image();
        System.out.println("\n=========SEM PROXY==========");
            i.draw();
            i.getExtent();


        System.out.println("\n=========COM PROXY==========");
        //isso usando o proxy
        IGraphic g = new ImageProxy(new Image());
        g.draw();
        g.getExtent();

    }
}