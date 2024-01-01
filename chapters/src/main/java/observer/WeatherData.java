package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeatherData implements Subject {
    private Set<Observer> observers;
    private WeatherState weatherState;

    public WeatherData() {
        observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(weatherState);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(WeatherState weatherState) {
        this.weatherState = weatherState;
        measurementsChanged();
    }
}
