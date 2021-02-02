<<<<<<< HEAD:src/main/lab6/models/Paragraph.java
        package main.lab6.models;
import main.lab6.services.*;
=======
        package lab6.models;
        >>>>>>> parent of 6abb7d3... lab7:src/lab6/models/Paragraph.java
public class Paragraph implements Element {
    private String name;
    private AlignStrategy TextAlignment;

    Paragraph(String name)  {
        this.name=name;
    }

    public void print() {
        if(TextAlignment!=null) {
            TextAlignment.render(this);
        }
        else {
            System.out.println("Pargraph with name: " + this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignment) {
        this.TextAlignment = alignment;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}