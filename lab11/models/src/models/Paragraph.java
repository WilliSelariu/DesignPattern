package models;

import lombok.NoArgsConstructor;
import services.AlignStrategy;

import javax.persistence.Entity;
import java.util.ArrayList;

@NoArgsConstructor(force = true)
@Entity
public class Paragraph implements Element {

    private String name;
    private AlignStrategy TextAlignment;
    private String oldName;
    private ArrayList<Observer> observerList=new ArrayList<>();
    public Paragraph(String name)  {
        this.name=name;
    }

    public void print() {
        if(TextAlignment!=null) {
            TextAlignment.render(this);
        }
        else {
            System.out.println("Pargraph with name: " + this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignment) {
        this.TextAlignment = alignment;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept( Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
        oldName=name;
        name=newValue;
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
            i.update(oldName,name);
        }
    }
}