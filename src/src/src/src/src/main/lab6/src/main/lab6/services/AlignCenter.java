package main.lab6.services;

import main.lab6.models.*;



public class AlignCenter implements AlignStrategy {
    String content = "";


    AlignCenter() {
        content = "          ";
    }

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(content + paragraph.getName());

    }
}