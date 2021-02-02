package main.lab2;

public class Image implements Element {
    private String name;

    Image (String name){
        this.name=name;
    }
    public void print()
    {
        System.out.println("Image: " + this.name);

    }
}