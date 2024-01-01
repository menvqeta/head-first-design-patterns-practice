package observer;

import javax.swing.plaf.ColorUIResource;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        WeatherState weatherState = WeatherState.builder().temp(80).humidity(65).pressure(30.4f).build();
        weatherData.setMeasurements(weatherState);

        weatherState = WeatherState.builder().temp(82).humidity(70).pressure(29.2f).build();
        weatherData.setMeasurements(weatherState);

        weatherState = WeatherState.builder().temp(78).humidity(90).pressure(29.2f).build();
        weatherData.setMeasurements(weatherState);

    }
}
