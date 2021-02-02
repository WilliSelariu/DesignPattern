package services;

import models.Observer;

public interface Observable {

    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();

}