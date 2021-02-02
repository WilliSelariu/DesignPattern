package services;


import models.Paragraph;
import models.Section;
import models.Book;

public class OpenCommand implements Command {
    public void execute() {
        createBook();
    }
    public void createBook(){
        Book b1=new Book("Book");
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        b1.addContent(cap1);

        DocumentManager.getInstance().setBook(b1);
    }
}