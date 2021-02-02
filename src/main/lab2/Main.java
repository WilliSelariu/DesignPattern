package main.lab2;

public class Main {
    public static void main(String[] args){
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
//        Author siu =  new Author("Slave in Utero");
        noapteBuna.addAuthor(rpGheo);
//        noapteBuna.addAuthor((siu));
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));

        Section testcap = new Section("Here's a touching story");
        testcap.add(new Paragraph("Chop Chop"));
        noapteBuna.addContent(testcap);
        testcap.remove(new Paragraph("Chop Chop"));
        noapteBuna.print();
    }
}