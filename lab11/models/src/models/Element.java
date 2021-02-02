package models;

public interface Element {
    void print();
    void accept( Visitor visitor);
    void setNewValue(String newValue);
}