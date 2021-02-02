package main.lab1;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    ArrayList<Paragraph> paragraphs= new ArrayList<>();
    private ArrayList<Table> tables= new ArrayList<>();
    private  ArrayList<Image> images = new ArrayList<>();

    SubChapter(String name){
        this.name=name;
    }

    public void CreateNewParagraph(String name){
        Paragraph paragraph= new Paragraph(name);
        paragraphs.add(paragraph);
    }
    public void CreateNewImage(String name){
        Image image= new Image(name);
        images.add(image);
    }
    public void CreateNewTable(String name){
        Table table= new Table(name);
        tables.add(table);
    }
    public void print(){
        System.out.println("   " + this.name);System.out.println();

        printImages();
        printParagraphs();
        printTables();
    }

    private void printParagraphs(){
        for(Paragraph i : this.paragraphs){
            i.print();
        }

    }
    private void printImages(){
        for(Image i : this.images)
        {
            i.print();
        }

    }
    private void printTables(){
        for( Table i : this.tables){
            i.print();
        }

    }
}