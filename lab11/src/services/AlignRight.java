package services;

import models.Paragraph;

public class AlignRight implements AlignStrategy {
    String content = "";

    AlignRight() {
        content = "                      ";
    }

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(content + paragraph.getName());
    }
}