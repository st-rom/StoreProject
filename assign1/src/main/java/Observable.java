import java.util.ArrayList;
import java.util.List;

public class Observable {
    public List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
