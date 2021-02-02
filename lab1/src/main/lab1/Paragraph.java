package main.lab1;


public class Paragraph {

    private String name;

    Paragraph (String name){
        this.name=name;
    }
    public void print()
    {
        System.out.print("    Paragraph: " + this.name);
        System.out.println();
    }

}