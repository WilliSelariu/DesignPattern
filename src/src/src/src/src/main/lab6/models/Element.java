package main.lab6.models;
public interface Element {
    void print();
    void accept(Visitor visitor);
}