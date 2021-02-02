package main.lab6.services;

import main.lab6.models.*;

public class AlignRight implements AlignStrategy {
    String content = "";

    AlignRight() {
        content = "                      ";
    }

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(content+paragraph.getName());
    }
}