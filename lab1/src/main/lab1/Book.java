package main.lab1;

import java.util.ArrayList;

public class Book {

    public Book(){}
    public String title;
    private ArrayList<Author> authors= new ArrayList<>();
    private ArrayList<Chapter> chapters= new ArrayList<>();

    public Book (String title){
        this.title= title;
    }

    public int createChapter(String name)
    {
        Chapter ch= new Chapter(name);
        chapters.add(ch);
        return chapters.indexOf(ch);
    }

    public Chapter getChapter(int index)
    {
        return chapters.get(index);
    }

    public void addAuthor(Author autor)
    {
        authors.add(autor);
    }

    public void print()
    {
        System.out.println("Book's title: " + this.title);
        printAuthors();
        printContent();
        printChapter();
    }

    private void printContent() {
        System.out.print("Content: ");
        if(chapters.size() > 1) {

            for(int i = 0; i < chapters.size()-1; i++) {
                chapters.get(i).printContent();
                System.out.print(", ");
            }
            chapters.get(chapters.size()-1).printContent(); System.out.println(".");
        }
        else {

            chapters.get(chapters.size()-1).printContent(); System.out.println(".");
        }
    }



    private void printChapter(){
        System.out.println();
        for (Chapter i : chapters)
        {
            i.print();
        }

    }
    private void printAuthors(){
        System.out.print("Written by: ");
        if(authors.size() > 1) {

            for(int i = 0; i < authors.size()-1; i++) {
                authors.get(i).print();
                System.out.print(", ");
            }
            authors.get(authors.size()-1).print(); System.out.println(".");
        }
        else {

            authors.get(authors.size()-1).print(); System.out.println(".");
        }
    }

}