package models;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(force = true)
@Entity
public class ImageProxy implements Element {
    @Id
    String name;
    Image realImage=null;
    public ImageProxy(String name) {
        this.name=name;
    }

    public Image LoadImage(String name) {
        Image res = new Image(name);
        return res;
    }


    @Override
    public void print() {
        if(realImage==null){
            realImage = new Image(this.name);
        }
        realImage.print();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
    @Override
    public void setNewValue(String newValue) {

    }

}