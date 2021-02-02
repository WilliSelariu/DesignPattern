package main.lab7;

public class Author {
    private String name;

    Author(String name){
        this.name=name;
    }

    public void print()
    {
        System.out.println("Author: "+this.name);
    }

    public static class AlignLeft implements AlignStrategy {
        String content = "";

        AlignLeft() {
            content = "     ";
        }

        @Override
        public void render(Paragraph paragraph) {
            System.out.println(content+paragraph.getName());

        }

    }

    public static class AlignCenter implements AlignStrategy{
        String content = "";


        AlignCenter() {
            content = "          ";
        }

        @Override
        public void render(Paragraph paragraph) {
            System.out.println(content + paragraph.getName());

        }
    }

    public static class AlignRight implements AlignStrategy {
        String content = "";

        AlignRight() {
            content = "                      ";
        }

        @Override
        public void render(Paragraph paragraph) {
            System.out.println(content+paragraph.getName());
        }
    }

    public static interface AlignStrategy {
        void render(Paragraph alignment);
    }
}