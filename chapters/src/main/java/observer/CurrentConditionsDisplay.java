package observer;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private WeatherData weatherData;
    private WeatherState weatherState;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherState weatherState) {
        this.weatherState = weatherState;
        display();
    }

    public void display() {
        log.info("Current conditions-> Temp: {} Celsius, Humidity: {}%",
                weatherState.getTemp(), weatherState.getHumidity());
    }


}
