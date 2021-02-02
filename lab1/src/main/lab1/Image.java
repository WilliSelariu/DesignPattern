package main.lab1;

public class Image {
    private String name;

    Image (String name){
        this.name=name;
    }
    public void print()
    {
        System.out.print("    Image: " + this.name);
        System.out.println();
    }
}