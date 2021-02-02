package  models;

import services.ImageLoaderFactory;
import services.Observable;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(force = true)
@Entity
public class Image implements Element {
    private String imageName;
    private String oldimageName;
    private ArrayList<Observer> observerList=new ArrayList<>();
    public void print() {
        System.out.println(imageName);
    }

    public Image(String name) {
        this.imageName = name;
        new ImageLoaderFactory().load(name);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
    @Override
    public void setNewValue(String newValue) {
        oldimageName=imageName;
        this.imageName=newValue;
    }


    public void addObserver(Observer obs) {
        observerList.add(obs);
        notifyObservers();
    }


    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }


    public void notifyObservers() {
        for(Observer i:observerList){
            i.update(oldimageName,imageName);
        }
    }
}