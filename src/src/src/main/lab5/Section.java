package main.lab5;

import java.util.ArrayList;

public class Section implements Element {

    String sectionTitle;
    ArrayList<Element> content = new ArrayList<>();

    void add(Element elm){
        content.add(elm);
    }

    void remove(Element elm){
        content.remove(elm);
    }

    Element getElement(int index){
        return content.get(index);
    }

    public void print(){

        System.out.println(this.sectionTitle);
        for(Element i : this.content){
            i.print();
        }
    }

    Section (String sectionTitle){
        this.sectionTitle = sectionTitle;
    }
}