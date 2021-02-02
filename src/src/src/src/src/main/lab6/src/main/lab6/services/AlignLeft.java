package main.lab6.services;

import main.lab6.models.*;
public class AlignLeft implements AlignStrategy{
    String content = "";

    AlignLeft() {
        content = "     ";
    }

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(content+paragraph.getName());

    }

}