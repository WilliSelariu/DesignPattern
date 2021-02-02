package models;

import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

@NoArgsConstructor(force = true)
@Entity
public class Section extends BaseElement implements Visitor {
    @Id
    private String sectionTitle;
    private String oldsectionTitle;
    private ArrayList<Observer> observerList=new ArrayList<>();
    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    Vector<Element> content = new Vector<Element>();



    public int add(Element element) {
        content.add(element);
        return content.size();
    }

    void remove(Element element) {
        for(Element i: content) {
            content.remove(i);
        }
    }

    Element getElement(int index) {
        return content.get(index);
    }

    @Override
    public void print() {
        System.out.println(sectionTitle);
        for(Element i: content) {
            i.print();
        }
    }
    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }



    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element i:content) {
            i.accept(visitor);
        }
    }

    @Override
    public void visit(Image image) {

    }

    @Override
    public void visit(ImageProxy imageProxy) {

    }

    @Override
    public void visit(Paragraph paragraph) {

    }

    @Override
    public void visit(Table table) {

    }

    @Override
    public void visit(Section section) {

    }

    @Override
    public void visit(Book book) {

    }

    @Override
    public void setNewValue(String newValue) {
        this.oldsectionTitle=sectionTitle;
        sectionTitle=newValue;
        notifyObservers();
    }


    public void addObserver(Observer obs) {
        observerList.add(obs);
    }


    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }


    public void notifyObservers() {
        for(Observer i:observerList){
            i.update(oldsectionTitle,sectionTitle);
        }
    }
}