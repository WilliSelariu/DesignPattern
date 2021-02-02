package main.lab7;

public interface Element {
    void print();
    void accept(Visitor visitor);
}