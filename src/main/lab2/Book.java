package main.lab2;

import java.util.ArrayList;

public class Book {

    public Book(){}
    public String title;
    private ArrayList<Author> authors= new ArrayList<>();
    private ArrayList<Element> content = new ArrayList<>();
    public Book (String title){
        this.title= title;
    }

    public void addAuthor(Author autor)
    {
        authors.add(autor);
    }

    public void addContent(Element elm){
        content.add(elm);
    }

    public void print()
    {
        System.out.println("Book's title: " + this.title);
        printAuthors();
        printContent();
    }

    private void printContent() {
        System.out.println("Content: ");

        if(content.size() > 1) {

            for(int i = 0; i < content.size()-1; i++) {
                content.get(i).print();
//                System.out.print();
            }
            content.get(content.size()-1).print(); System.out.println();
        }
        else {

            content.get(content.size()-1).print(); System.out.println();
        }
    }



    //    private void printChapter(){
//        System.out.println();
//        for (Chapter i : chapters)
//        {
//            i.print();
//        }
//
//    }
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