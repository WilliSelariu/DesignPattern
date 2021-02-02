package main.lab1;

public class Main {
    public static void main(String[] args){

        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        Author siu = new Author("Slave In Utero");
        discoTitanic.addAuthor(rpGheo);
        discoTitanic.addAuthor(siu);

        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);

        int indexChapterTwo = discoTitanic.createChapter("Capitolul 2");
        Chapter chp2 = discoTitanic.getChapter(indexChapterTwo);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");

        SubChapter scOneOne = chp1.getSupChapter(indexSubChapterOneOne);
        scOneOne.CreateNewParagraph("Paragraph 1");
        scOneOne.CreateNewParagraph("Paragraph 2");
        scOneOne.CreateNewParagraph("Paragraph 3");
        scOneOne.CreateNewImage("Image 1");
        scOneOne.CreateNewParagraph("Paragraph 4");
        scOneOne.CreateNewTable("Table 1");
        scOneOne.CreateNewParagraph("Paragraph 5");
        discoTitanic.print();


    }
}