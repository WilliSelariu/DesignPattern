package main.lab6.models;
public class ImageProxy implements Element {
    String name;

    ImageProxy(String name) {
        this.name=name;
    }

    public Image LoadImage(String name) {
        Image res = new Image(name);
        return res;
    }


    @Override
    public void print() {
        Image res = LoadImage(this.name);
        res.print();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

}