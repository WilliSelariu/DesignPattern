package main.lab4;

public class ImageProxy implements Element {

    Image realImage;
    private String url;

    ImageProxy(String name) {
        this.url = name;
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