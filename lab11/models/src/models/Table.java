package models;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@NoArgsConstructor(force = true)
@Entity
public class Table implements Element {
    @Id
    private String name;
    private String oldName;
    private ArrayList<Observer> observerList=new ArrayList<>();
    public Table(String name) {
        this.name=name;
    }

    public void print() {
        System.out.println("Table with name: " + this.name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
    @Override
    public void setNewValue(String newValue) {
        this.oldName=this.name;
        this.name=newValue;
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