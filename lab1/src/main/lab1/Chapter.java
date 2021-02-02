package main.lab1;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters= new ArrayList<>();

    Chapter(String name){
        this.name=name;
    }

    public int createSubChapter(String name)
    {
        SubChapter subc= new SubChapter(name);
        subChapters.add(subc);
        return subChapters.indexOf(subc);
    }

    public SubChapter getSupChapter(int index)
    {
        return subChapters.get(index);

    }
    public void print(){
        System.out.print(this.name); System.out.println();
        printSubChapters();
    }

    public void printContent(){
        System.out.print(this.name);
    }

    private void printSubChapters()
    {
        for(SubChapter i : subChapters)
        {

            i.print();
        }
        System.out.println();
    }
}

