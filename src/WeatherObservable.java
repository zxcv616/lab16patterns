import java.util.ArrayList;
import java.util.List;

public class WeatherObservable {
    private List<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String newWeather) {
        for (WeatherObserver observer : observers) {
            observer.updateWeather(newWeather);
        }
    }
}