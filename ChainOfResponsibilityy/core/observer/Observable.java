package ChainOfResponsibilityy.core.observer;

public interface Observable {

    void register(Observer obj);

    void notifyObservers();

}
