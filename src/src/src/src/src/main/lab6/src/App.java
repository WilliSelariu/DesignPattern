<<<<<<< HEAD:src/src/src/src/src/main/lab6/src/main/App.java
        package main.lab6;
import main.lab6.models.*;
import main.lab6.services.*;
=======
public class App {
    public static void main(String[] args) throws Exception {
>>>>>>> parent of 6abb7d3... lab7:src/lab6/App.java

        // long startTime = System.currentTimeMillis();
        // ImageProxy img1 = new ImageProxy("Pamela Anderson");
        // ImageProxy img2 = new ImageProxy("Kim Kardashian");
        // ImageProxy img3 = new ImageProxy("Kirby Griffin");
        // Section playboyS1 = new Section("Front Cover");
        // playboyS1.add(img1);
        // Section playboyS2 = new Section("Summer Girls");
        // playboyS2.add(img2);
        // playboyS2.add(img3);
        // Book playboy = new Book("Playboy");
        // playboy.addContent(playboyS1);
        // playboy.addContent(playboyS2);
        // long endTime = System.currentTimeMillis();
        // System.out.println("Creation of the content took " + (endTime -
        // startTime) + " milliseconds");
        // startTime = System.currentTimeMillis();
        // playboyS1.print();
        // endTime = System.currentTimeMillis();
        // System.out.println("Printing of the section 1 took " + (endTime -
        // startTime) + " milliseconds");
        // startTime = System.currentTimeMillis();
        // playboyS1.print();
        // endTime = System.currentTimeMillis();
        // System.out.println("Printing again the section 1 took " + (endTime -
        // startTime) + " milliseconds");

        // Section cap1 = new Section("Capitolul 1");
        // Paragraph p1 = new Paragraph("Paragraph 1");
        // cap1.add(p1);
        // Paragraph p2 = new Paragraph("Paragraph 2");
        // cap1.add(p2);
        // Paragraph p3 = new Paragraph("Paragraph 3");
        // cap1.add(p3);
        // Paragraph p4 = new Paragraph("Paragraph 4");
        // cap1.add(p4);
        // System.out.println("Printing without Alignment");
        // System.out.println();
        // cap1.print();
        // p1.setAlignStrategy(new AlignCenter());
        // p2.setAlignStrategy(new AlignRight());
        // p3.setAlignStrategy(new AlignLeft());

        // System.out.println();
        // System.out.println("Printing with Alignment");
        // System.out.println();
        // cap1.print();
        // Image picture = new Image("resources/heart.png");
        // Image picture2 = new Image("resources/nature.jpg");
        // Image picture3 = new Image("resources/w3c.bmp");

        // BookStatistics statistics = new BookStatistics();

        // statistics.printStatistics();

        Section cap1 = new Section("Capitolul 1");
        Section cap2 = new Section("Capitolul 2");
        cap1.add(cap2);
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("resources/heart.png"));
        cap1.add(new Image("resources/nature.jpg"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();



    }
}