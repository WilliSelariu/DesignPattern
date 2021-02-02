package models;

public interface Observer {
    void update(String oldValue, String newValue);
}