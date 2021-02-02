package models;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(force = true)
@Entity
public class Author {
    private String name;

    Author(String name){
        this.name=name;
    }

    public void print()
    {
        System.out.println("Author: "+this.name);
    }

}