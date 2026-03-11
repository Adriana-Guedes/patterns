package designerpattern.proxy;


//Essa classe é proxy neste caso da classe Image
public class ImageProxy implements IGraphic{
    private Image image;



    //adiciona um comportamente e adiciona o chamado do objeto original
    public ImageProxy(Image image){
        this.image = image;
    }


    @Override
    public void draw() {
        System.out.println("PROXY executou para o draw");
        image.draw();

    }

    @Override
    public void getExtent() {
        System.out.println("PROXY executou para o getExtent");

    }
}
