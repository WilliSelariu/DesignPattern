
package main.lab6.models;
import main.lab6.services.ImageLoaderFactory;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String name;

    public void print() {
        System.out.println(name);
    }

    Image(String name) {
        this.name = name;
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
}