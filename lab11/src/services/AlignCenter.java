package services;

import models.Paragraph;

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