package BehavioralPatterns.Observer;

public interface Observed {
    public void addObserve(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
