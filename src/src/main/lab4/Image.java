package main.lab4;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void print()
    {
        System.out.println("Image: " + this.imageName);
    }
}