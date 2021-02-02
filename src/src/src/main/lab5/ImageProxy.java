package main.lab5;

public class ImageProxy implements Element {

    Image realImage;
    private String url;
    String dim;

    ImageProxy(String name, String dim) {
        this.url = name;
        this.dim = dim;
    }

    ImageProxy() {
    }

    Image loadImage(String url) {
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    };

    public void print(){

        loadImage(url).print();

    }
}