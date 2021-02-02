package main.lab7;

public class Paragraph implements Element {
    private String name;
    private Author.AlignStrategy TextAlignment;

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

    public void setAlignStrategy(Author.AlignStrategy alignment) {
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