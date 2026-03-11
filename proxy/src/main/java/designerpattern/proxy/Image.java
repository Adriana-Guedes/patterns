package designerpattern.proxy;

public class Image implements IGraphic {


    @Override
    public void draw() {
        System.out.println("Executou draw");

    }

    @Override
    public void getExtent() {
        System.out.println("Executou getExtent");

    }
}
